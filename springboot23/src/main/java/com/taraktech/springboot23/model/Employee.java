package com.taraktech.springboot23.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "springemp")
public class Employee {
    @Id
    @Column(name = "ENO")
    private Long eno;
    @Column(name = "ENAME")
    private String ename;
    @Column(name = "ESAL")
    private Float esal;
    @Column(name = "EADDR")
    private String eaddr;
}
