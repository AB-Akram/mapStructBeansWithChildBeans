package org.example.mapstructbeanswithchildbeans.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "salary")
    private float salary;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id",foreignKey = @ForeignKey(name = "emp_dept_fk"))
    private Department department;
}
