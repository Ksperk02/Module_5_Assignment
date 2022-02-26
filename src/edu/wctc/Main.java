package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MissingNameException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle initial: ");
        String middleInitial = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Year of birth (YYYY): ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Month of birth (1-12): ");
        int month = Integer.parseInt(scanner.nextLine());

        System.out.print("Day of birth (1-31): ");
        int day = Integer.parseInt(scanner.nextLine());

        System.out.print("Gender (M/F): ");
        String gender1 = scanner.nextLine();
        char gender = gender1.charAt(0);


        DriversLicense dl = new DriversLicense();

        FirstNameUtility fn = new FirstNameUtility();
        int FFF = fn.encodeFirstName(firstName, middleInitial);
        dl.setFFF(FFF);

        try {
            LastNameUtility ln = new LastNameUtility();
            String SSSS = ln.encodeLastName(lastName);
            dl.setSSSS(SSSS);
        } catch (MissingNameException e) {
            e.printStackTrace();
        }
        try {
            MonthDayGenderUtility md = new MonthDayGenderUtility();
            int DDD = md.encodeMonthDayGender(year, month, day, gender);
            dl.setDDD(DDD);
        } catch (UnknownGenderCodeException | InvalidBirthdayException e) {
            e.printStackTrace();
        }

        String YY = Integer.toString(year).substring(2);
        dl.setYY(Integer.parseInt(YY));
        dl.setNN(0);
        WisconsinFormatter wf = new WisconsinFormatter();
        FloridaFormatter ff = new FloridaFormatter();
        System.out.println(wf.formatLicenseNumber(dl));
        System.out.println(ff.formatLicenseNumber(dl));
    }
}