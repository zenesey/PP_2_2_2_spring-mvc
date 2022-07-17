package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;
import web.service.CarsServiceimpl;

import java.util.List;

@Controller
//@RequestMapping("/cars")
public class CarsController {

    CarsService service;
    @Autowired
    public CarsController(CarsService service) {
        this.service = service;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "index", required = false) Integer index,
                           ModelMap model) {
        if (index == null) {
            model.addAttribute("cars",service.getCars(5));
        }else {
            model.addAttribute("cars", service.getCars(index));
        }

//        try {
//            model.addAttribute("cars", serviceimpl.getCars(index));
//        } catch (NumberFormatException e) {
//            model.addAttribute("cars", serviceimpl.getCars(5));
//        }


        return "cars";
    }
}

