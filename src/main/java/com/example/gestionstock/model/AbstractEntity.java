package com.example.gestionstock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.Instant;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity {
    @Id
    private Integer Id;
    @CreatedDate
    @Column(name = "creationDate", nullable = false)
    @JsonIgnore
    private Instant CreationDate;
    @LastModifiedDate
    @Column(name = "LastModifiedDate")
    @JsonIgnore
    private Instant LastModifiedDate;
}
