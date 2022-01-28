package nvc.bcit.icefactory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import nvc.bcit.icefactory.model.factory;
import nvc.bcit.icefactory.repository.factoryRepository;

@Controller
public class MainController {
    @Autowired
    factoryRepository repository;
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/factory")
    public ModelAndView getFactories(){
        List<factory> factorys = repository.findAll();
        return new ModelAndView("factory","factorys",factorys);
    }

    @GetMapping("/factory/{id}")
    public ModelAndView getFactory(@PathVariable("id") int id){
        List<factory> factorys = repository.findAll();
        return new ModelAndView("factory","factorys",factorys);
    }
}
