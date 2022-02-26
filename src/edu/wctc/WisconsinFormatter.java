package edu.wctc;

import org.jetbrains.annotations.NotNull;

public class WisconsinFormatter implements DriversLicenseFormatter {

    public String formatLicenseNumber(@NotNull DriversLicense driversLicense) {
        String yy = Integer.toString((driversLicense.getYY()));
        char y = yy.charAt(0);
        char y2 = yy.charAt(1);
        return driversLicense.getSSSS() + "-" + driversLicense.getFFF() + y + "-" + y2 + driversLicense.getDDD() +
                "-" + driversLicense.getNN();
    }
}