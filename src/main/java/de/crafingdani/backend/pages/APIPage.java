package de.crafingdani.backend.pages;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIPage
{
    @GetMapping("/api")
    public String onAPIEnter()
    {
        return "api";
    }
}
