package com.taraktech.springboot24.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "bootemp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "eno")
    private Long eno;
    @Column(name = "ename")
    private String ename;
    @Column(name = "esal")
    private Float esal;
    @Column(name = "eaddr")
    private String eaddr;
}
