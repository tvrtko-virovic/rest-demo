package com.tvrtkovirovic.springrestdemo.addressbook;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
@AllArgsConstructor
public class ContactController {

    private final ContactRepository contactRepository;

    @GetMapping(path = "/", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Contact>> get()
    {
        List<Contact> entities = this.contactRepository.findAll();

        return new ResponseEntity<>(entities, HttpStatus.OK);
    }
}
