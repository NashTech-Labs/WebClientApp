package com.knoldus.webclientapp.service;

import com.knoldus.webclientapp.dto.RegisterResponse;
import com.knoldus.webclientapp.dto.RegisterUser;
import com.knoldus.webclientapp.dto.Suggestion;
import com.knoldus.webclientapp.dto.User;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientService {

    WebClient webClient;
    @Bean
    public void webclient(){
        webClient = WebClient.create();
    }

    /**
     * This method sent a request to public API
     * by using webclient to get the response back.
     * @return list of users.
     */
    public Flux<User> getUsers(){
        return webClient.get()
                .uri("https://gorest.co.in/public/v2/users/").header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve().bodyToFlux(User.class);
    }

    /**
     * This method sent a request to public API
     * by using webclient to get the response back.
     * @return Text suggestion as a Json response.
     */
    public Mono<Suggestion> getSuggestion(){
        return webClient.get()
                .uri("https://www.boredapi.com/api/activity").header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve().bodyToMono(Suggestion.class);
    }

    /**
     * @param user as a json body, name and job of user.
     * @return Json body.
     */
    public Mono<RegisterResponse> userRegister(RegisterUser user){
        return webClient.post()
                .uri("https://reqres.in/api/users")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(Mono.just(user), RegisterUser.class)
                .retrieve()
                .bodyToMono(RegisterResponse.class);
    }

}
