package com.example.testjob.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "test_job")
@NoArgsConstructor
@Data
public class TestJobModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "result_array")
    private String resultArray;

}
