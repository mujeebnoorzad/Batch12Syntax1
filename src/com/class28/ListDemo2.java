package com.class28;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String>course=new LinkedList<>();
        course.add("SDLC");
        course.add("Manual Testing");
        course.add("Java");
        course.add("GIt");
        course.add("Selenium");
        course.add("TestNg");
        course.add("Cucumber");
        course.add("SQL");
        course.add("API");
        course.add("Jenkins");
        course.add("Interview");
        course.add("Resume");
        course.add("AWS");
        course.add("APM");
        course.add("Docker");
        course.add("Dead");
        System.out.println(course);
        course.set(course.size()-1,("Happy"));// replace
        course.set(4,("Happy"));
        System.out.println(course);


    }
}
