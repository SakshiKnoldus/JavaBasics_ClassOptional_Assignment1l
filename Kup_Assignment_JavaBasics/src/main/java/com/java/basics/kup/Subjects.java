package com.java.basics.kup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Subjects {

        /* This is done to avoid the
        warning for magic numbers*/
        static final int STUDENT1_ROLLNO = 1;
        static final int STUDENT2_ROLLNO = 2;
        static final int STUDENT3_ROLLNO = 3;
        static final int STUDENT4_ROLLNO = 4;
        static final int STUDENT5_ROLLNO = 5;
        static final int STUDENT6_ROLLNO = 6;

        private static Student student1 = new Student("Sakshi", STUDENT1_ROLLNO,
                Optional.of(Arrays.asList("Java", "Testing", "Kafka")), "xyz");

        private static Student student2 = new Student("Mitali", STUDENT2_ROLLNO,
                Optional.of(Arrays.asList("Java", "AI/ML", "Kafka")), "xyz");

        private static Student student3 = new Student("Sivani", STUDENT3_ROLLNO,
                Optional.of(Arrays.asList("GoLang", "Linux", "DevOps")), "bcd");

        private static Student student4 = new Student("Anmol", STUDENT4_ROLLNO,
                Optional.empty(),"bcd");

        private static Student student5 = new Student("Ritu", STUDENT5_ROLLNO,
                Optional.of(Arrays.asList("QA", "Data Science")), "efg");

        private static Student student6 = new Student("Reema", STUDENT6_ROLLNO,
                Optional.empty(), "efg");

        public static List<Student> listOfStudent() {
                List<Student> addStudent = new ArrayList<>();
                addStudent.add(student1);
                addStudent.add(student2);
                addStudent.add(student3);
                addStudent.add(student4);
                addStudent.add(student5);
                addStudent.add(student6);

                return addStudent;
        }

        public static List<ClassRoom> listOfClass() {
                ClassRoom classID1 = new ClassRoom("xyz",
                        Optional.of(Arrays.asList(student1, student2)));
                ClassRoom classID2 = new ClassRoom("bcd",
                        Optional.of(Arrays.asList(student3, student4)));
                ClassRoom classID3 = new ClassRoom("efg",
                        Optional.of(Arrays.asList(student5, student6)));
                ClassRoom classID4 = new ClassRoom("uvw",
                        Optional.empty());
                List<ClassRoom> classObj = new ArrayList<>();
                classObj.add(classID1);
                classObj.add(classID2);
                classObj.add(classID3);
                classObj.add(classID4);

                return classObj;

        }
}
