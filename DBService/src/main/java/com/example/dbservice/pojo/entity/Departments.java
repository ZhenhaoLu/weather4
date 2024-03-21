package com.example.dbservice.pojo.entity;


import javax.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table()
public class Departments {

    @Id
    private Integer id;
    @Column
    private String name;
    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private List<Employees> employeesList;
}
