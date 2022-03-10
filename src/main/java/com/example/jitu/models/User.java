package com.example.jitu.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NotEmpty(message = "*Please provide an username")

    private String username;


    @Column
    @Email(message = "*Please provide a valid Email")
    private String email;


    @Column
    private String firstname;

    @Column
    private String othernames;

    @Column
    private int retryCount;

    @Column
    @Length(min = 5, message = "*Your password must have at least 5 characters")
    @NotEmpty(message = "*Please provide your password")
    private String password;

    public String toJson() {

        StringBuffer sb = new StringBuffer();
        sb.append("{\"id\":").append("\"").append(getId()).append("\",");
        sb.append("\"username\":\"").append(getUsername() == null ? "" : getUsername()).append("\",");
        sb.append("\"firstname\":\"").append(getFirstname() == null ? "" : getFirstname()).append("\",");
        sb.append("\"othernames\":\"").append(getOthernames() == null ? "" : getOthernames()).append("\",");
        sb.append("\"role\":\"").append(getRetryCount()).append("\"},").append("\n");
        return sb.toString();
    }
}
