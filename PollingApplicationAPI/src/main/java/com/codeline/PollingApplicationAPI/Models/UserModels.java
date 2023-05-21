package com.codeline.PollingApplicationAPI.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter
public class UserModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;

     String username;
     String password;
}
