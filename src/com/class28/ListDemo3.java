package com.class28;

import java.util.LinkedList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> course = new LinkedList<>();
        course.add("SDLC");
        course.add("Manual Testing");
        course.add("Java");
        course.add("GIt");
        course.add("Selenium");
        System.out.println(course);
        for (int i = 0; i < course.size(); i++) {
            if (course.get(i).equals("Java")) {
                course.set(i, "Happy");

            }

        }

        System.out.println(course);
    }
}