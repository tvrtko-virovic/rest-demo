package com.tvrtkovirovic.springrestdemo.addressbook;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.cert.X509Certificate;
import java.util.List;

@RestController
@RequestMapping("/contact")
@AllArgsConstructor
public class ContactController {

    private final ContactRepository contactRepository;
    private final ModelMapper modelMapper;

    @GetMapping(path = "/", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ContactDto>> get()
    {
        List<ContactDto> contactDtos = this.contactRepository
                .findAll()
                .stream()
                .map(contact -> modelMapper.map(contact, ContactDto.class))
                .toList();
        return new ResponseEntity<>(contactDtos, HttpStatus.OK);
    }
}
