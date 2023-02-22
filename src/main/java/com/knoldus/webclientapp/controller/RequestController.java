package com.knoldus.webclientapp.controller;

import com.knoldus.webclientapp.dto.RegisterResponse;
import com.knoldus.webclientapp.dto.RegisterUser;
import com.knoldus.webclientapp.dto.Suggestion;
import com.knoldus.webclientapp.service.ClientService;
import com.knoldus.webclientapp.dto.User;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/get")
public class RequestController {

    ClientService clientService;

    public RequestController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/users")
    public Flux<User> getUsers(){
        return clientService.getUsers();
    }

    @GetMapping("/suggest")
    public Mono<Suggestion> getSuggestion(){
        return clientService.getSuggestion();
    }

    @PostMapping("/register")
    public Mono<RegisterResponse> userSignup(@RequestBody RegisterUser user){
        return clientService.userRegister(user);
    }

}
