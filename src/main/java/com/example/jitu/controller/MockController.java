package com.example.jitu.controller;

import com.example.jitu.models.MockData;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.*;

@RestController
@RequestMapping("/mockData")
public class MockController extends BaseController {

    @PostMapping("/getSampleTime")

    public ResponseEntity<HashMap> saveUser(@RequestBody List<MockData> mockDataList) {
        try {
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (MockData mockData : mockDataList) {
                String name = mockData.getName();
                int time = hashMap.getOrDefault(name, 0);
                time += mockData.getTime();
                hashMap.put(name, time);
            }
            System.out.println("");
            for (String key : hashMap.keySet()) {
                System.out.printf("", key, hashMap.get(key));
            }

            return new ResponseEntity<HashMap>(hashMap, HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
