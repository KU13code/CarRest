package ru.car.rest.models;

import lombok.Data;
import ru.car.rest.validation.EmailVerified;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "cars")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true,updatable = false)
    private int id;

    @Column(name = "brand")
    @Size(min = 2, max = 15, message = "name less than 2 characters or more than 15")
    private String brand;

    @Column(name = "model")
    @Size(min = 2, max = 15, message = "name less than 2 characters or more than 15")
    private String model;

    @Column(name = "engine")
    private String engine;

    @Column(name = "ls")
    @Min(value = 100,message = "at least 100 ls")
    private int ls;

    @Column(name = "transmission")
    @NotBlank(message = "no transmission selected")
    private String transmission;

    @Column(name = "owner")
    @Size(min = 2, max = 15, message = "name less than 2 characters or more than 15")
    private String owner;

    @NotBlank(message = "field cannot be empty")
    @Column(name = "phoneNumber")
    @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7}$", message = "Please, user pattern +7XXX-XXX-XX-XX")
    private String phoneNumber;

    @Column(name = "email")
    @NotBlank(message = "field cannot be empty")
    @Email(message = "isn't email")
    @EmailVerified
    private String email;

}
