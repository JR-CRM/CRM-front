package ru.ldwx.crmfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message", "Hello world!");
        return "index";
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public String customers() {
        return "customers";
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String orders() {
        return "orders";
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String order() {
        return "order";
    }

    @RequestMapping(value = "/supplier-orders", method = RequestMethod.GET)
    public String supplierOrders() {
        return "supplier-orders";
    }
}
