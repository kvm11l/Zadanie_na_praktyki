package pl.Kamil.Rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.Kamil.Rest.serivce.HelloService;

@RestController
public class HelloController {


    private final HelloService helloService;                              // dodanie serwisu ktory moglby cos wiecej zawierac


    public HelloController(HelloService helloService) {             // zalecany spsob wstrzykiwania
        this.helloService = helloService;
    }

    @GetMapping("/")                                                // przywpisaniu
    public String hello(){
       // return "Witam, to jest z klasy HelloController";          // to moglbym miec gdybym nie mial helloService czyli jakiejs klasy zawierajace bardzo rozbudowany Service
        return helloService.helloFromService();
    }
}
