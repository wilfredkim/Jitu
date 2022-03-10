package com.example.jitu.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MockData implements Serializable {
    private int time;

    private String name;
}
