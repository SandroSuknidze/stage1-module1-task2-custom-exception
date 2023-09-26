package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {
    public StudentNotFoundException(long id) {
        super("Could not find student with ID " + id);
    }
}
