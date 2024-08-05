package com.codewithranjeet.userService.entities;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "micro_user")
@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "about")
    private String about;

}
