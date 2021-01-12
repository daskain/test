package com.example.testjob.controller;

import com.example.testjob.model.TestJobModel;
import com.example.testjob.service.TestJobService;
import com.example.testjob.service.WorkOnArrayService;
import org.aspectj.weaver.patterns.HasThisTypePatternTriedToSneakInSomeGenericOrParameterizedTypePatternMatchingStuffAnywhereVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/arr")
public class WorkOnArrayController {

    TestJobService testJobService;
    WorkOnArrayService workOnArrayService;

    @Autowired
    WorkOnArrayController(TestJobService testJobService, WorkOnArrayService workOnArrayService) {
        this.testJobService = testJobService;
        this.workOnArrayService = workOnArrayService;
    }

    @GetMapping("/generate")
    public ResponseEntity generateArr() {
        TestJobModel testJobModel = new TestJobModel();
        int[] arr = workOnArrayService.generateArr();

        testJobModel.setResultArray(Arrays.toString(workOnArrayService.sortArr(arr)));
        testJobService.saveArr(testJobModel);

        return new ResponseEntity(testJobModel, HttpStatus.OK);
    }

    @GetMapping("/get_all")
    public List<TestJobModel> getAll(){

        return testJobService.getAll();
    }
}
