package de.crafingdani.backend.pages;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorPage
{
    @GetMapping("/error")
    public String onError()
    {
        return "error";
    }
}
