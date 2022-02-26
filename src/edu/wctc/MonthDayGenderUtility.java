package edu.wctc;

import java.time.DateTimeException;
import java.time.LocalDate;

public class MonthDayGenderUtility {

    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender(int year, int month, int day, char genderCode)
            throws InvalidBirthdayException, UnknownGenderCodeException {
        try {
            LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            throw new InvalidBirthdayException(year, month, day);
        }

        if (Character.toUpperCase(genderCode) != CODE_MALE && Character.toUpperCase(genderCode) != CODE_FEMALE) {
            throw new UnknownGenderCodeException(genderCode);
        }

        if (Character.toUpperCase(genderCode) == CODE_FEMALE) return (month - 1) * 40 + day + MOD_FEMALE;
        else return (month - 1) * 40 + day + MOD_MALE;
    }
}