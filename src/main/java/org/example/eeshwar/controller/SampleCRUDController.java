package org.example.eeshwar.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/crud")
public class SampleCRUDController {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    String create(@RequestBody String anyString) {
        return "Created " + anyString + " Successfully...";
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/update")
    String update(@RequestBody String anyString) {
        return "Created " + anyString + " Successfully...";
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/get")
    String read() {
        return "You Got it";
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/delete")
    String read(@RequestBody String anyString) {
        return "Done";
    }
}
