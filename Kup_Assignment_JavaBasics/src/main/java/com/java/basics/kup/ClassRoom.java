package com.java.basics.kup;

import java.util.List;
import java.util.Optional;

public class ClassRoom {

        public String roomID;
        private Optional<List<Student>> studentList;

        public ClassRoom( String roomID,
                          Optional<List<Student>> studentList) {
                this.roomID = roomID;
                this.studentList = studentList;
        }

        public ClassRoom(String roomID) {
                this.roomID = roomID;
        }


        public String getRoomID() {
                return roomID;
        }


        public Optional<List<Student>> getStudentList() {
                return studentList;
        }

        @Override
        public String toString() {
                return "ClassRoom ID {" + roomID
                        + "Student List" + studentList + "}";
        }

}
