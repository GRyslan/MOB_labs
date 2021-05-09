package ua.kpi.comsys.iv8305.ui.lab12;

public class CoordinateRun {
    public static void main(String[] args) {

        CoordinateRH cNS0 = new CoordinateRH(Direction.LATITUDE);
        CoordinateRH cEW0 = new CoordinateRH(Direction.LONGITUDE);

        try {
            //CoordinateRH cNSd_err =  new CoordinateRH(Direction.LATITUDE, 108, 0, 0);
            //CoordinateRH cEWd_err =  new CoordinateRH(Direction.LONGITUDE, -195, 0, 0);
           // CoordinateRH cm_err =  new CoordinateRH(Direction.LATITUDE, 66, -3, 0);
            //CoordinateRH cs_err =  new CoordinateRH(Direction.LATITUDE, 25, 0, 99);
            //CoordinateRH cs_outRabge = new CoordinateRH(Direction.LONGITUDE, -180, 20, 0);

            CoordinateRH cNS1 = new CoordinateRH(Direction.LATITUDE, -75, 43, 12);
            CoordinateRH cNS2 = new CoordinateRH(Direction.LATITUDE, 44, 32, 57);
            CoordinateRH cEW1 = new CoordinateRH(Direction.LONGITUDE, -12, 30, 40);
            CoordinateRH cEW2 = new CoordinateRH(Direction.LONGITUDE, -2, 30, 40);

            System.out.println("Zero coordinate N-S: " + cNS0.degreeStr() + " = " + cNS0.decimalString());
            System.out.println("Zero coordinate E-W: " + cEW0.degreeStr() + " = " + cEW0.decimalString());
            System.out.println("Coordinate 1 N-S: " + cNS1.degreeStr() + " = " + cNS1.decimalString());
            System.out.println("Coordinate 2 N-S: " + cNS2.degreeStr() + " = " + cNS2.decimalString());
            System.out.println("Coordinate 1 E-W: " + cEW1.degreeStr() + " = " + cEW1.decimalString());
            System.out.println("Coordinate 2 E-W: " + cEW2.degreeStr() + " = " + cEW2.decimalString());

            CoordinateRH res;
            System.out.println("\nAttempt to calculate middle between 0 and coordinate 1 N-S with exemplar method...");
            res = cNS0.middleWith(cNS1);
            if (res == null) System.out.println("Attempt failed.");
            else System.out.println("Success! Result is: " + res.degreeStr() + " = " + res.decimalString());
            System.out.println("\nAttempt to calculate middle between 0 and coordinate 1 N-S with class method...");
            res = CoordinateRH.middleTwo(cNS0, cNS1);
            if (res == null) System.out.println("Attempt failed.");
            else System.out.println("Success! Result is: " + res.degreeStr() + " = " + res.decimalString());
            System.out.println("\nAttempt to calculate middle between 0 and coordinate 2 E-W with exemplar method...");
            res = cEW0.middleWith(cEW2);
            if (res == null) System.out.println("Attempt failed.");
            else System.out.println("Success! Result is: " + res.degreeStr() + " = " + res.decimalString());
            System.out.println("\nAttempt to calculate middle between coordinates 1 and 2 N-S with class method...");
            res = CoordinateRH.middleTwo(cNS1, cNS2);
            if (res == null) System.out.println("Attempt failed.");
            else System.out.println("Success! Result is: " + res.degreeStr() + " = " + res.decimalString());
            System.out.println("\nAttempt to calculate middle between coordinates 1 and 2 W-E with class method...");
            res = CoordinateRH.middleTwo(cEW1, cEW2);
            if (res == null) System.out.println("Attempt failed.");
            else System.out.println("Success! Result is: " + res.degreeStr() + " = " + res.decimalString());
            System.out.println("\nAttempt to calculate middle between coordinate 1 N-S and coordinate 2 E-W with exemplar method...");
            res = cNS1.middleWith(cEW2);
            if (res == null) System.out.println("Attempt failed.");
            else System.out.println("Success! Result is: " + res.degreeStr() + " = " + res.decimalString());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
