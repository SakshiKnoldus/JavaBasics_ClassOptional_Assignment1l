package com.java.basics.kup;

import java.util.List;
import java.util.Optional;

public class Student extends ClassRoom {

        private String name;
        private int rollNumber;
        private Optional<List<String>> subject;


        public Student(String name, int rollNumber,
                        Optional<List<String>> subject, String roomID)  {

                super(roomID);
                this.name = name;
                this.rollNumber = rollNumber;
                this.subject = subject;

        }

        public final String getName() {
                return name;
        }

        public final int getRollNumber() {
                return rollNumber;
        }

        public final Optional<List<String>> getSubject() {
                return subject;
        }


        public String getRoomID() {
         return roomID;
}
        @Override
        public String toString() {
                return "Student name : " + name + " Student rollNumber : "
                        + rollNumber + " Student Subject : " + subject + "Student RoomID : " + roomID +"";
        }


}
