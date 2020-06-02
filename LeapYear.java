public class LeapYear {
    // public String getMessage() {
    // return "Hello World!";
    // }

    public static boolean isLeapYear(String year) {
        boolean leapYr = false;
        int yearInt = Integer.parseInt(year);

        if (year.length() > 4) {
            throw new RuntimeException("Year can not be longer than 4 digits");
        } else {
            if (yearInt % 4 == 0 && yearInt % 100 != 0) {
                leapYr = true;
            } else if (yearInt % 100 == 0 && yearInt % 400 == 0) {
                leapYr = true;
            } else {
                leapYr = false;
            }
        }

        return leapYr;
    }

}