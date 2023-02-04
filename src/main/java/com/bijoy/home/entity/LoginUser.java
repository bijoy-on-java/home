package com.bijoy.home.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "app_login", schema = "home_app")
public class LoginUser {
    @Id
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String userName;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private Date dateCreated;
    @Getter
    @Setter
    private Date lastUpdated;

    @Getter
    @Setter
    private String remarks;
}
