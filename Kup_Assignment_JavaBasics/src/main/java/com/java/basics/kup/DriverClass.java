package com.java.basics.kup;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DriverClass {

        public static void main(String[] args) {

    /* Scenario 1 : Find the students associated
    with a room that have no subjects associated. */

                System.out.println("Scenario 1 : Students associated with a room that have no subjects associated.");

                        List<Student> studentNameList = Subjects.listOfStudent().stream()
                                .filter(r -> !r.getRoomID().isEmpty())
                                .filter(s -> !s.getSubject().isPresent())
                                .collect(Collectors.toList());

                        List<String> name = new ArrayList<>();

                        for (Student stud : studentNameList) {

                                name.add(stud.getName());

                        }
                        System.out.println(name+"\n");

        /* Scenario 2 : Find the unique subject list of the students
        associated with a room that has roomID "xyz". */

                System.out.println("Scenario 2 :Unique subject list of the students associated with a room that has roomID xyz.");

                List<List<Student>> subRoomId = Subjects.listOfClass().stream()
                        .filter(o -> o.getRoomID().equals("xyz"))
                        .map(m -> m.getStudentList()
                                .get()).collect(Collectors.toList());

                List<List<String>> listSub = subRoomId.get(0).stream()
                        .filter(i -> i.getSubject().isPresent())
                        .map(o -> o.getSubject()
                                .get()).collect(Collectors.toList());

                Set<String> getList = listSub
                        .stream().flatMap(a -> a.stream())
                        .collect(Collectors.toSet());

                System.out.println(getList+"\n");

        /* Scenario 3 : print "hello Student" if a room
        has students associated. */

                System.out.println("Scenario 3 : Printing hello Student if a room has students associated.");

                List<ClassRoom> roomAllot = Subjects.listOfClass().stream()
                        .filter(a -> a.getStudentList().isPresent())
                        .collect(Collectors.toList());

                roomAllot.forEach(det -> System.out.println("Room ID : "
                        + det.getRoomID() + " :" + " hello Student"));


        }


}
