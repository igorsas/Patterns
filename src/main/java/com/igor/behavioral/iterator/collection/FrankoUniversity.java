package com.igor.behavioral.iterator.collection;

import com.igor.behavioral.iterator.iterator.UniversityIterator;
import com.igor.behavioral.iterator.model.MemberType;
import com.igor.behavioral.iterator.model.UniversityMember;

public class FrankoUniversity<T> implements University {
    private FrankoUniversity.Node<UniversityMember> first;
    private FrankoUniversity.Node<UniversityMember> last;
    private UniversityMember[] students;
    private UniversityMember[] teachers;
    private int size;

    public FrankoUniversity() {
        students = new UniversityMember[0];
        teachers = new UniversityMember[0];
        size = 0;
    }

    public void addMember(UniversityMember member) {
        addNewMember(member);
        if (member.getType() == MemberType.STUDENT) {
            students = getArrayWithNewMember(students, member);
        }else {
            teachers = getArrayWithNewMember(teachers, member);
        }
    }

    private void addNewMember(UniversityMember student) {
        final FrankoUniversity.Node<UniversityMember> l = last;
        final FrankoUniversity.Node<UniversityMember> newNode = new FrankoUniversity.Node<>(l, student, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    public int getSize() {
        return size;
    }

    @Override
    public UniversityIterator getStudentIterator() {
        return new StudentsIterator();
    }

    @Override
    public UniversityIterator getTeacherIterator() {
        return new TeachersIterator();
    }

    @Override
    public UniversityIterator getAllMemberIterator() {
        return new AllMembersIterator();
    }

    private UniversityMember[] getArrayWithNewMember(UniversityMember[] array, UniversityMember member) {
        UniversityMember[] newArray = new UniversityMember[array.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i < array.length ? array[i] : member;
        }
        return newArray;
    }

    private static class Node<E> {
        E item;
        FrankoUniversity.Node<E> next;
        FrankoUniversity.Node<E> prev;

        Node(FrankoUniversity.Node<E> prev, E element, FrankoUniversity.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private class StudentsIterator implements UniversityIterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < students.length;
        }

        @Override
        public UniversityMember getNext() {
            return students[index++];
        }
    }

    private class TeachersIterator implements UniversityIterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < teachers.length;
        }

        @Override
        public UniversityMember getNext() {
            return teachers[index++];
        }
    }

    private class AllMembersIterator implements UniversityIterator {
        FrankoUniversity.Node<UniversityMember> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public UniversityMember getNext() {
            UniversityMember current = this.current.item;
            this.current = this.current.next;
            return current;
        }
    }
}
