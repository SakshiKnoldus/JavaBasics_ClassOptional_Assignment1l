package com.java.basics.kup;

import java.util.Arrays;
import java.util.Optional;

class ClassRoomTest {

        ClassRoom classRoom = new ClassRoom("xyz");

        final int STUDENT1_ROLLNO = 1;
        final int STUDENT2_ROLLNO = 2;

        Student student1 = new Student("Sakshi", STUDENT1_ROLLNO,
                Optional.of(Arrays.asList("Java", "Testing", "Kafka")), "xyz");

        Student student2 = new Student("Mitali", STUDENT2_ROLLNO,
                Optional.of(Arrays.asList("Java", "AI/ML", "Kafka")), "xyz");


        ClassRoom classID1 = new ClassRoom("xyz",
                Optional.of(Arrays.asList(student1, student2)));

        @org.junit.jupiter.api.Test
        void getRoomID() {

                assert(classRoom.getRoomID().equals("xyz"));

        }

        @org.junit.jupiter.api.Test
        void getStudentList() {

               assert(classID1.getStudentList().isPresent());

        }

        @org.junit.jupiter.api.Test
        void testToString() {

               assert (classID1.toString().equals("ClassRoom ID {xyzStudent ListOptional[[Student name : Sakshi Student rollNumber : 1 Student Subject : Optional[[Java, Testing, Kafka]]Student RoomID : xyz, Student name : Mitali Student rollNumber : 2 Student Subject : Optional[[Java, AI/ML, Kafka]]Student RoomID : xyz]]}"));

        }
}