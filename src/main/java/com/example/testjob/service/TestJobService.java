package com.example.testjob.service;

import com.example.testjob.model.TestJobModel;

import java.util.List;

public interface TestJobService {

    List<TestJobModel> getAll();
    TestJobModel getById(int id);
    void saveArr(TestJobModel testJobModel);
}
