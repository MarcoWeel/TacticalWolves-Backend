package com.tacticalwolves.accountapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String Email;
    private String Name;
    private String PasswordHash;
    private String PasswordSalt;
    private Role Role;
}

enum Role{
    Users,
    Member,
    Admin,

}