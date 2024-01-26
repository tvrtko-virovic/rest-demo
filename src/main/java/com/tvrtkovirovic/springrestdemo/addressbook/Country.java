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
public class Country extends BaseEntity {

    @Column(length =50, nullable = false)
    private String name;

    @Column(length = 2, nullable = false)
    private String code;

}
