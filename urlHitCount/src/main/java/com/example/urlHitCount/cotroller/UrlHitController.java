package com.example.urlHitCount.cotroller;

import com.example.urlHitCount.model.vist;
import com.example.urlHitCount.service.UrlHitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

    private final UrlHitService services;

    public UrlHitController(UrlHitService services) {
        this.services = services;
    }

    @GetMapping("username/{username}/count")
    public vist getNames(@PathVariable String username)
    {

         return services.getByName(username);
    }

    @GetMapping("count")
    public String getCount()
    {
        return "count:" + services.getCounts();
    }




}
