package com.example.jitu.models;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@MappedSuperclass
public abstract class AuditModel implements Serializable {
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDate dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDate dateUpdated;


    @Column(name = "date_deleted")
    private LocalDate dateDeleted;



    @PrePersist
    public void create() {
        if (dateCreated == null) dateCreated =LocalDate.now();

        if (dateUpdated == null) dateUpdated =LocalDate.now();;


    }

    @PreUpdate
    public void update() {
        if (dateUpdated == null) dateUpdated =LocalDate.now();;
    }

}
