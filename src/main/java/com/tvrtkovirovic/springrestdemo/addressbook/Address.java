package com.tvrtkovirovic.springrestdemo.addressbook;

import com.tvrtkovirovic.springrestdemo.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor()
@AllArgsConstructor
public class Address extends BaseEntity {

    @Column
    private String street;

    @Column
    private int contactId;

//    @ManyToOne
//    @JoinColumn(name = "contactid")
//    private Contact contact;

}
