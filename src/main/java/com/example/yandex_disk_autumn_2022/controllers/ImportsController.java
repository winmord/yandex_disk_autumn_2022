package com.example.yandex_disk_autumn_2022.controllers;

import com.example.yandex_disk_autumn_2022.model.FileSystemElement;
import com.example.yandex_disk_autumn_2022.services.ImportsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/imports")
public class ImportsController {

    private ImportsService service;

    public ImportsController(ImportsService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<?> getAllElements() {
        return new ResponseEntity<>(service.getAllElements(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<?> insertElement(@RequestBody FileSystemElement fileSystemElement) {
        service.insertElement(fileSystemElement);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
