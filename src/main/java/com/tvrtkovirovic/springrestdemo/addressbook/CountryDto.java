package com.tvrtkovirovic.springrestdemo.addressbook;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CountryDto {
    private int id;
    private String name;
    private String code;
}
