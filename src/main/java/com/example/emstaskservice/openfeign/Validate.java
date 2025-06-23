package com.example.emstaskservice.openfeign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "validate", url = "${USER_URL}")
public interface Validate {

    @GetMapping("general/validate")
    String validate(@RequestHeader("Cookie") String cookieHeader);
}
