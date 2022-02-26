package edu.wctc;

import org.apache.commons.codec.language.Soundex;

public class LastNameUtility {
    private final Soundex soundex = new Soundex();

    public String encodeLastName(String lastName) throws MissingNameException {
        if (lastName.isEmpty()) throw new MissingNameException("last name");
        else return soundex.encode(lastName);
    }
}