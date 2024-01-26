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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="contact_id", insertable=false, updatable=false)
    private Contact contact;

    @ManyToOne
    private Country country;

}
