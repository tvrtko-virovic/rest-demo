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
public class Phone extends BaseEntity {

    @Column
    private String phoneNumber;

    @Column
    private int contactId;

//    @ManyToOne
//    @JoinColumn(name = "contactid")
//    private Contact contact;
}
