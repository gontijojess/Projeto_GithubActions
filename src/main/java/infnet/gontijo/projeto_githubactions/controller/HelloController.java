package infnet.gontijo.projeto_githubactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Olá, mundo!";
    }

    @GetMapping("/teste")
    public String teste() {
        return "Olá, isso é um teste!";
    }
}
