package com.aml.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Data
@Table
public class SinhVien{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maSV;

    @Column(name = "hoTen")
    private String hoTen;

    @Column(name = "ngaySinh")
    private String ngaySinh;

    @Column(name = "cccd")
    private String cccd;

    @Column(name = "email")
    private String email;

    @Column(name = "diaChi")
    private String diaChi;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "sinhvien_role",
            joinColumns = @JoinColumn(name = "sinhvien_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;


    @OneToMany(mappedBy = "sinhVien", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Task> tasks;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "sinhvien_course",
            joinColumns = @JoinColumn(name = "sinhvien_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> courses;


}
