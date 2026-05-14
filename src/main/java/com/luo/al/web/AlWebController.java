package com.luo.al.web;

import com.luo.al.AlAgent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AlWebController {

    private final AlAgent alAgent = new AlAgent();

    @GetMapping("/al")
    public String alHome() {
        return "al_home";
    }

    @PostMapping("/al/invoke")
    public String invokeAi(@RequestParam String input, Model model) {
        String result = alAgent.process(input);
        model.addAttribute("result", result);
        return "al_home";
    }
}
