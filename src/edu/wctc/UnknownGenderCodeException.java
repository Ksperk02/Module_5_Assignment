package edu.wctc;

public class UnknownGenderCodeException extends Exception {
    UnknownGenderCodeException(char genderCode) {
        super(genderCode + ": Gender code not known, my dude.");
    }
}