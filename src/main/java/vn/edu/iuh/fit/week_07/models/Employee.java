package vn.edu.iuh.fit.week_07.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.week_07.enums.EmployeeStatus;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long empId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    private EmployeeStatus status;

    @OneToMany(mappedBy = "employee")
    private List<Order> orders;
}