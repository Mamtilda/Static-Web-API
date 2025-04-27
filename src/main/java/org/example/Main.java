package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Main {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/bathrooms")
    public String bathrooms() {
        return "bathrooms";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @GetMapping("/doors")
    public String doors() {
        return "doors";
    }
    @GetMapping("/flooring")
    public String flooring() {
        return "flooring";
    }
    @GetMapping("/kitchen")
    public String kitchen() {
        return "kitchen";
    }
    @GetMapping("/stairs")
    public String stairs() {
        return "stairs";
    }
    @GetMapping("/windows")
    public String windows() {
        return "windows";
    }
    @GetMapping("/sitemap")
    public String sitemap() {
        return "sitemap";
    }

    @PostMapping("/submit")
    public String submit(
            @RequestParam String firstname,
            @RequestParam String lastname,
            @RequestParam String companyname,
            @RequestParam String email,
            @RequestParam String telephonenumber,
            @RequestParam String address,
            @RequestParam String postcode,
            @RequestParam String enquiry
    ) {
        System.out.println("We have received your form:");
        System.out.println("Firstname: " + firstname);
        System.out.println("Lastname: " + lastname);
        System.out.println("Company Name: " + companyname);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + telephonenumber);
        System.out.println("Address: " + address);
        System.out.println("Postcode: " + postcode);
        System.out.println("Enquiry: " + enquiry);

        return "contact";
    }

}
