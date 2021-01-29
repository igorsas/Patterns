package com.igor.behavioral.iterator.view;

import com.igor.behavioral.iterator.collection.FrankoUniversity;
import com.igor.behavioral.iterator.iterator.UniversityIterator;
import com.igor.behavioral.iterator.model.MemberType;
import com.igor.behavioral.iterator.model.UniversityMember;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {
    public static void main(String[] args) {
        FrankoUniversity<UniversityMember> universityMembers = getUniversityMembersArray();
        UniversityIterator studentIterator = universityMembers.getStudentIterator();
        UniversityIterator teacherIterator = universityMembers.getTeacherIterator();
        UniversityIterator allMemberIterator = universityMembers.getAllMemberIterator();

        System.out.println("Students:\n");
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.getNext());
        }

        System.out.println("\nTeachers:\n");
        while (teacherIterator.hasNext()) {
            System.out.println(teacherIterator.getNext());
        }

        System.out.println("\nAll membrs:\n");
        while (allMemberIterator.hasNext()) {
            System.out.println(allMemberIterator.getNext());
        }


    }

    private static FrankoUniversity<UniversityMember> getUniversityMembersArray() {
        FrankoUniversity<UniversityMember> members = new FrankoUniversity<>();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            boolean hasNext = false;

            do {
                UniversityMember member;
                System.out.println("Enter name: ");
                String name = reader.readLine();
                System.out.println("Enter age: ");
                int age = Integer.parseInt(reader.readLine());
                System.out.println("Please enter member type:\n" +
                        "1 - Student\n" +
                        "2 - Teacher");
                int colorId = Integer.parseInt(reader.readLine());

                switch (colorId) {
                    case 1:
                        member = new UniversityMember(name, age, MemberType.STUDENT);
                        break;
                    case 2:
                        member = new UniversityMember(name, age, MemberType.TEACHER);
                        break;
                    default:
                        throw new IllegalArgumentException("\n\n--- University has no such member type ---\n\n");
                }
                members.addMember(member);
                System.out.println("Would you like to add another member(Skip if not): ");
                hasNext = !reader.readLine().isEmpty();
            } while (hasNext);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return members;
    }
}
