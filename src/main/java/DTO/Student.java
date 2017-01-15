package DTO;

import lombok.*;

import java.util.*;

/**
 * Created by liu on 17/1/13.
 */
@Data
public class Student {
    private String name;
    private int age;
    private int sex;
    private List<String> courseList;
    private List<Double> gradeList;
}
