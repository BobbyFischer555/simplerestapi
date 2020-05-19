package com.company.simplerestapi.controller;

import com.company.simplerestapi.domain.MainElement;
import com.company.simplerestapi.repository.MainElementRepository;
import com.company.simplerestapi.service.MainElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    private MainElementService mainElementService;

    @GetMapping("/getJSON")
    public ResponseEntity<?> getJSON() {
        List<MainElement> registrations = mainElementService.getAll();
        return ResponseEntity.ok().body(registrations);
    }
}
