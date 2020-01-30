package com.igor.behavioral.iterator.iterator;

import com.igor.behavioral.iterator.model.UniversityMember;

public interface UniversityIterator {
    boolean hasNext();

    UniversityMember getNext();
}
