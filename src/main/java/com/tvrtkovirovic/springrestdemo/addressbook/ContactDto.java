package com.tvrtkovirovic.springrestdemo.addressbook;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ContactDto {
    private int id;
    private String name;
    private String surname;
    private List<AddressDto> addresses;
    private List<PhoneDto> phones;
}
