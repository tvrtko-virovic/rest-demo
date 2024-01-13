package com.tvrtkovirovic.springrestdemo.addressbook;

import com.tvrtkovirovic.springrestdemo.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;

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

//    @Column
//    private int contactId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="contact_id", insertable=false, updatable=false)
    private Contact contact;
}
