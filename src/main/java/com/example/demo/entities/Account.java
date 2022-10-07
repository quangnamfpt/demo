package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private Long id;

    @Column(name = "account_email", unique = true, nullable = false)
    private String email;

    @Column(name = "account_password", nullable = false)
    private String password;

    @Column(name = "account_isActive", nullable = false)
    private boolean isActive = true;

    @Column(name = "account_isBlock", nullable = false)
    private boolean isBlock = false;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Account account;
}