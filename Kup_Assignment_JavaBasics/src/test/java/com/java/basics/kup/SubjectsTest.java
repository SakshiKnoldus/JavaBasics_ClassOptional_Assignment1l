package com.java.basics.kup;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;

class SubjectsTest {

        static final int STUDENT1_ROLLNO = 1;
        static final int STUDENT2_ROLLNO = 2;

        private static Student student1 = new Student("Sakshi", STUDENT1_ROLLNO,
                Optional.of(Arrays.asList("Java", "Testing", "Kafka")), "xyz");

        private static Student student2 = new Student("Mitali", STUDENT2_ROLLNO,
                Optional.of(Arrays.asList("Java", "AI/ML", "Kafka")), "xyz");


        ClassRoom classID1 = new ClassRoom("xyz",
                Optional.of(Arrays.asList(student1, student2)));


        @Test
        void listOfStudent() {

                assert (student1.getStudentList().isPresent());
                assert (student2.getStudentList().isPresent());
              }

        @Test
        void listOfClass() {

                assert (classID1.getStudentList().isPresent());
                assert (classID1.getRoomID().equals("xyz"));
        }
}