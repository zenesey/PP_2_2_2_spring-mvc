package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsServiceimpl;

@Controller
//@RequestMapping("/cars")
public class CarsController {
    CarsServiceimpl serviceimpl = new CarsServiceimpl();

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "index", required = false) Integer index,
                           ModelMap model) {
        if (index == null) {
            model.addAttribute("cars",serviceimpl.getCars(5));
        }else {
            model.addAttribute("cars", serviceimpl.getCars(index));
        }

//        try {
//            model.addAttribute("cars", serviceimpl.getCars(index));
//        } catch (NumberFormatException e) {
//            model.addAttribute("cars", serviceimpl.getCars(5));
//        }


        return "cars";
    }
}

