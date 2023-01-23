package com.h2_database_project.pojo;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "provider")
@AllArgsConstructor
@NoArgsConstructor
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    @NotNull
    private String first_name;

    @Column
    @NotNull
    private String last_name;

    @Column
    private String middle_name;

    @Column
    @NotNull
    private String dob;
}
