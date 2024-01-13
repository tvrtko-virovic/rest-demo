package com.tvrtkovirovic.springrestdemo.addressbook;

import com.tvrtkovirovic.springrestdemo.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor()
@AllArgsConstructor
public class Contact extends BaseEntity {

    @Column
    private String name;

    @Column
    private String surname;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="contact_id")
    private List<Address> addresses;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="contact_id")
    private List<Phone> phones;

}
