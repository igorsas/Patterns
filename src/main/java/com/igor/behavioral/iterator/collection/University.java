package com.igor.behavioral.iterator.collection;


import com.igor.behavioral.iterator.iterator.UniversityIterator;

public interface University {
    UniversityIterator getStudentIterator();
    UniversityIterator getTeacherIterator();
    UniversityIterator getAllMemberIterator();
}
