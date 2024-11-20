package com.taraktech.springboot25.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eno;
    @Column(name = "ename")
    private String ename;
    @Column(name = "esal")
    private Float esal;
    @Column(name = "eaddr")
    private String eaddr;
}
