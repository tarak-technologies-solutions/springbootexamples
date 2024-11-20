package com.tarakteck.sprinbootjdbc.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Data
@Table(name = "emp")
public class Employee {
    @Id
    private Long eno;
    private String ename;
    private Float esal;
    private String eaddr;
}
