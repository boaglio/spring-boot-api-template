package com.boaglio.springbootapitemplate.rest;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MockService {

    @GetMapping("/host")
    @ResponseBody
    public String server() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostName();
    }

    @GetMapping("/time")
    @ResponseBody
    public LocalDateTime time() {
        return LocalDateTime.now();
    }
}
