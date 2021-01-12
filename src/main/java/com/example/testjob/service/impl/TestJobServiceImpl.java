package com.example.testjob.service.impl;

import com.example.testjob.model.TestJobModel;
import com.example.testjob.repository.TestJobRepository;
import com.example.testjob.service.TestJobService;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestJobServiceImpl implements TestJobService {

    private TestJobRepository testJobRepository;

    @Autowired
    TestJobServiceImpl(TestJobRepository testJobRepository) {
        this.testJobRepository = testJobRepository;
    }

    @Override
    public List<TestJobModel> getAll() {
        return testJobRepository.findAll();
    }

    @Override
    public TestJobModel getById(int id) {
        return testJobRepository.getOne(Long.valueOf(id));
    }

    @Override
    public void saveArr(TestJobModel testJobModel) {
        testJobRepository.save(testJobModel);
    }
}
