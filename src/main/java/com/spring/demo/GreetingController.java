package com.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class GreetingController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/greeting/result").setViewName("result");
    }

    // adds `name` to GreetingControllers Model object which
    // adds `model.name` object for binding and handling `name` data
    // adds `greetingForm` object as view model for this path
    @GetMapping("/greeting")
    public String greeting(
        @RequestParam(name="name", required=false, defaultValue="Grand Vizier") String name, 
        Model model,
        GreetingForm greetingForm
    ) {
        model.addAttribute("name", name);
        return "greeting";
    }


    @PostMapping("/greeting")
    public String checkGreetingInfo(
        GreetingForm greetingForm, 
        BindingResult bindingResult
    ) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        return "redirect:/greeting/result";
    }

    @Bean
    GreetingForm getGreetingForm() {
        return new GreetingForm();
    }
}