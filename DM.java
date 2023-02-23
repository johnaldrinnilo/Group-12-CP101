import java.util.Scanner;

public class DM {
    public static int displayMenu(Scanner input) {
        System.out.println("\n" + "MOTORPH PAYROLL SYSTEM");
        System.out.println(",______________________________,");
        System.out.printf( "| 1) Employee Record           |\n", " ");
        System.out.printf( "| 2) Timekeeping               |\n", " ");
        System.out.printf( "| 3) Weekly Salary Computation |\n", " ");
        System.out.printf( "| 4) Logout                    |\n", " ");
        System.out.println("'______________________________'");
        System.out.print("Enter Selection: ");
        return input.nextInt();
    }

    public static int empNumberOptions(Scanner input) {
        System.out.println("\n" + "Please select an option");
        System.out.println(",______________________________,");
        System.out.printf( "| 1     - All Employees        |\n", " ");
        System.out.printf( "| 10005 - Romualdez, Alice     |\n", " ");
        System.out.printf( "| 10009 - San Jose, Allison    |\n", " ");
        System.out.printf( "| 0     - Back                 |\n", " ");
        System.out.println("'______________________________'");
        System.out.print("Enter Selection: ");
        return input.nextInt();
    }
}
