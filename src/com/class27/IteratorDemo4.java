package com.class27;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo4 {
    public static void main(String[] args) {
        List<String> course = new LinkedList<>();
        course.add("SDLC");
        course.add("Manual Testing");
        course.add("Java");
        course.add("GIt");
        course.add("Selenium");

        Iterator<String> iterator = course.iterator();
        System.out.println(course);
        while (iterator.hasNext()) {
            if (iterator.next().equals("Java")) {
              iterator.remove();
            }
        }
        System.out.println(course);
    }
}