package com.h2_database_project.contorller;

import com.h2_database_project.pojo.Provider;
import com.h2_database_project.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userinfo")
public class ProviderController {
    private final ProviderService providerService;

    @Autowired
    public ProviderController(ProviderService providerService) {
        this.providerService = providerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Provider> getProviderById(@PathVariable String id) {
        return new ResponseEntity<>(providerService.findById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Provider>> getAllProvider() {
        return new ResponseEntity<>(providerService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Provider> createProvide(@RequestBody Provider provider) {
        return new ResponseEntity<>(providerService.createProvider(provider), HttpStatus.OK);
    }
}
