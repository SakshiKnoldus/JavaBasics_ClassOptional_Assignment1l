package com.java.basics.kup;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

        int STUDENT1_ROLLNO = 1;
        int STUDENT2_ROLLNO = 2;

        Student student1 = new Student("Sakshi", STUDENT1_ROLLNO,
                Optional.of(Arrays.asList("Java", "Testing", "Kafka")), "xyz");

        Student student2 = new Student("Mitali", STUDENT2_ROLLNO,
                Optional.of(Arrays.asList("Java", "AI/ML", "Kafka")), "xyz");

        ClassRoom classID1 = new ClassRoom("xyz",
                Optional.of(Arrays.asList(student1, student2)));

        @Test
        void getName() {

                assert (student1.getName().equals("Sakshi"));
                assert (student2.getName().equals("Mitali"));

        }

        @Test
        void getRollNumber() {

                assert (Objects.equals(student1.getRollNumber(), STUDENT1_ROLLNO));
                assert (Objects.equals(student2.getRollNumber(), STUDENT2_ROLLNO));
        }

        @Test
        void getSubject() {

                assert (student1.getSubject().equals(Optional.of(Arrays.asList("Java","Testing","Kafka"))));
                assert (student2.getSubject().equals(Optional.of(Arrays.asList("Java", "AI/ML", "Kafka"))));
        }

        @Test
        void getRoomID() {

                assert (student1.getRoomID().equals("xyz"));
                assert (student2.getRoomID().equals("xyz"));

        }

        @Test
        void testToString() {

                assert (classID1.toString().equals("ClassRoom ID {xyzStudent ListOptional[[Student name : Sakshi Student rollNumber : 1 Student Subject : Optional[[Java, Testing, Kafka]]Student RoomID : xyz, Student name : Mitali Student rollNumber : 2 Student Subject : Optional[[Java, AI/ML, Kafka]]Student RoomID : xyz]]}"));

        }



}