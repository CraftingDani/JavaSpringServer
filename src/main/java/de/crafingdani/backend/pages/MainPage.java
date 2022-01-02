package de.crafingdani.backend.pages;

import de.craftingdani.filereader.main.FileAPI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage
{
    private final String html = FileAPI.readFile("C:\\Users\\Daniel Gleich\\Desktop\\index.html");
    private final String style = FileAPI.readFile("C:\\Users\\Daniel Gleich\\Desktop\\style.css");
    private final String script = FileAPI.readFile("C:\\Users\\Daniel Gleich\\Desktop\\script.js");

    @GetMapping("/")
    public String onPageEnter()
    {
        System.out.println("someone entered.");
        return html
                + "\n<style>\n"
                + style
                + "</style>\n\n"
                + "<script>\n"
                + script
                + "</script>";
    }
}
