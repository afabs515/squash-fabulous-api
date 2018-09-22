package com.squashfabulous.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping(path = "/api/system")
public class SystemController {

    @GetMapping(path = "/ping")
    @ResponseBody
    public ResponseEntity<Mono<String>> ping() {
        return ResponseEntity.ok(Mono.just("pong"));
    }
}
