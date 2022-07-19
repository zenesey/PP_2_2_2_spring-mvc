package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

@Controller
//@RequestMapping("/cars")
public class CarsController {

    private final CarsService service;

    @Autowired
    public CarsController(CarsService service) {
        this.service = service;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "index", defaultValue = "5") Integer index,
                           ModelMap model) {
        model.addAttribute("cars", service.getCars(5));


        return "cars";
    }
}

