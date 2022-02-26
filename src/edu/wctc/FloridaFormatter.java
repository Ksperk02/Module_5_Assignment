package edu.wctc;

import org.jetbrains.annotations.NotNull;

public class FloridaFormatter implements DriversLicenseFormatter {

    public String formatLicenseNumber(@NotNull DriversLicense driversLicence) {

        String nn = Integer.toString(driversLicence.getNN());

        char n = nn.charAt(0);

        return driversLicence.getSSSS() + "-" + driversLicence.getFFF() + "-" +
                driversLicence.getYY() + driversLicence.getDDD() + "-" + n;
    }
}