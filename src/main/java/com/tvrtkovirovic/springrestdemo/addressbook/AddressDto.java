package com.tvrtkovirovic.springrestdemo.addressbook;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AddressDto {
    private Integer id;
    private String street;
    private CountryDto country;
}
