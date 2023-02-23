import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;

public class Main {
       public static void main(String[] args) throws IOException {

//Login for the Payroll System
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String CorpCode="", UserName="", Password="";
        int retry = 3;
        while (retry>0){
            Scanner x = new Scanner(System.in);
            System.out.println("WELCOME to MotorPH!");
            System.out.print("Corporate Code: ");
            CorpCode = x.nextLine();
            System.out.print("User Name: ");
            UserName = x.nextLine();
            System.out.print("Password: ");
            Password = x.nextLine();
            System.out.print("\n");
            if (CorpCode.equals("motorph143") && UserName.equals("Admin") && Password.equals("mmdc"))
                break;
            else
                System.out.println("You have entered an incorrect credential...");
            retry--;}
        if (retry>0){
            System.out.print("\n" + "Welcome " + UserName + "! Please select a value from the Display Menu:" + "\n");

//Display Menu Options
            int userchoice;
            do {
              userchoice = DM.displayMenu(input);

                switch (userchoice) {
                    case 1:
                        //View Employee Record
                        System.out.println("\n"+"Please enter Employee Number" +"\n"
                                +"\t"+"0    "+" - List of all Employees"+"\n"
                                +"\t"+10005 +" - Romualdez, Alice"+"\n"
                                +"\t"+10009 +" - San Jose, Alison");
                        System.out.print("Employee Number: ");
                        int EmpNo = scan.nextInt();
                        System.out.println();

                        if (EmpNo==10005) {
                            FileReader fr = new FileReader("Emp10005.txt");
                            Scanner infile = new Scanner (fr);
                            while(infile.hasNextLine()) {
                                String line=infile.nextLine();
                                System.out.println(line);}
                            infile.close();}
                        else if (EmpNo==10009) {
                            FileReader fr = new FileReader("Emp10009.txt");
                            Scanner infile = new Scanner (fr);
                            while(infile.hasNextLine()) {
                                String line=infile.nextLine();
                                System.out.println(line);}
                            infile.close();
                        }
                        else if (EmpNo==0) {
                            FileReader fr = new FileReader("EmpAll.txt");
                            Scanner infile = new Scanner (fr);
                            while(infile.hasNextLine()) {
                                String line=infile.nextLine();
                                System.out.println(line);}
                            infile.close();
                        }
                        else {
                            System.out.print("Error. Please Enter a valid Employee Number!" + "\n");}
                        break;

                    case 2://To compute Total Hours Worked
                        do{
                        System.out.println("\n"+"Please enter Employee Number" +"\n"
                                +"\t"+"1    "+" - Employee Totals"+"\n"
                                +"\t"+10005 +" - Romualdez, Alice"+"\n"
                                +"\t"+10009 +" - San Jose, Alison"+"\n"
                                +"\t"+0+"    "+" - Back");
                        System.out.print("Employee Number: ");
                        EmpNo = scan.nextInt();

                        if (EmpNo==10005) {
                            //Print the timelogs in textfile
                            System.out.println();
                            double d1, d2, d3, d4, d5, d6, d7;
                            String name;
                            FileReader freader = new FileReader("Timelogs10005.txt");
                            Scanner inFile = new Scanner(freader);

                            PrintWriter outFile = new PrintWriter("TimelogsOutput.txt");

                            // Read till end of file
                            while (inFile.hasNext())
                            {
                                name = inFile.next();
                                int empno=inFile.nextInt();

                                outFile.println("TIMEKEEPING");
                                outFile.println("September 9 to 15, 2022");
                                outFile.println("Employee Name: " + name);
                                outFile.println("Employee Number: " + empno);

                                d1 = inFile.nextDouble();
                                d2 = inFile.nextDouble();
                                d3 = inFile.nextDouble();
                                d4 = inFile.nextDouble();
                                d5 = inFile.nextDouble();
                                d6 = inFile.nextDouble();
                                d7 = inFile.nextDouble();
                                outFile.printf("Hours Worked: " +
                                        "%n         Sept  9,22        %1.2f " +
                                        "%n         Sept 10,22        %1.2f " +
                                        "%n         Sept 11,22        %1.2f " +
                                        "%n         Sept 12,22        %1.2f " +
                                        "%n         Sept 13,22        %1.2f " +
                                        "%n         Sept 14,22       %1.2f " +
                                        "%n         Sept 15,22        %1.2f %n", d1, d2, d3, d4,d5,d6,d7);
                                double TH = (d1+d2+d3+d4+d5+d6+d7);
                                //for computation of hours worked
                                whours.TAH=TH;

                                outFile.printf("Total Hours Worked:       %1.2f %n", TH);
                                outFile.printf("Regular Working Hours:    %1.2f %n", whours.RWH);
                                outFile.printf("Overtime Hours Worked:     %1.2f %n", whours.OTHours());
                                outFile.printf("Absence/Late/UT Hours:     %1.2f %n",  whours.LateUTHours());
                                outFile.println();}
                            inFile.close();
                            outFile.close();
                            FileReader fr = new FileReader("TimelogsOutput.txt");
                            Scanner infile = new Scanner (fr);
                            while(infile.hasNextLine()) {
                                String line=infile.nextLine();
                                System.out.println(line);}
                            infile.close();
                        }
                        else if (EmpNo==10007){
                            System.out.println();
                            double d1, d2, d3, d4, d5, d6, d7;
                            String name;
                            FileReader freader = new FileReader("Timelogs10007.txt");
                            Scanner inFile = new Scanner(freader);
                            PrintWriter outFile = new PrintWriter("TimelogsOutput.txt");

                            // Read till end of file
                            while (inFile.hasNext())
                            {
                                name = inFile.next();
                                int empno=inFile.nextInt();
                                outFile.println("TIMEKEEPING");
                                outFile.println("September 9 to 15, 2022");
                                outFile.println("Employee Name: " + name);
                                outFile.println("Employee Number: " + empno);

                                d1 = inFile.nextDouble();
                                d2 = inFile.nextDouble();
                                d3 = inFile.nextDouble();
                                d4 = inFile.nextDouble();
                                d5 = inFile.nextDouble();
                                d6 = inFile.nextDouble();
                                d7 = inFile.nextDouble();

                                outFile.printf("Hours Worked: " +
                                        "%n         Sept  9,22        %1.2f " +
                                        "%n         Sept 10,22        %1.2f " +
                                        "%n         Sept 11,22        %1.2f " +
                                        "%n         Sept 12,22        %1.2f " +
                                        "%n         Sept 13,22        %1.2f " +
                                        "%n         Sept 14,22        %1.2f " +
                                        "%n         Sept 15,22        %1.2f %n", d1, d2, d3, d4,d5,d6,d7);
                                double TH = (d1+d2+d3+d4+d5+d6+d7);
                                //for computation of hours worked
                                whours.TAH=TH;

                                outFile.printf("Total Hours Worked:       %1.2f %n", TH);
                                outFile.printf("Regular Working Hours:    %1.2f %n", whours.RWH);
                                outFile.printf("Overtime Hours Worked:     %1.2f %n", whours.OTHours());
                                outFile.printf("Absence/Late/UT Hours:     %1.2f %n",  whours.LateUTHours());
                                outFile.println();}
                            inFile.close();
                            outFile.close();

                            FileReader fr = new FileReader("TimelogsOutput.txt");
                            Scanner infile = new Scanner (fr);
                            while(infile.hasNextLine()) {
                                String line=infile.nextLine();
                                System.out.println(line);}
                            infile.close();
                        }
                        else if (EmpNo==10009) {
                            System.out.println();
                            double d1, d2, d3, d4, d5, d6, d7;
                            String name;
                            FileReader freader = new FileReader("Timelogs10009.txt");
                            Scanner inFile = new Scanner(freader);

                            PrintWriter outFile = new PrintWriter("TimelogsOutput.txt");

                            // Read till end of file
                            while (inFile.hasNext())
                            {
                                name = inFile.next();
                                int empno=inFile.nextInt();
                                outFile.println("TIMEKEEPING");
                                outFile.println("September 9 to 15, 2022");
                                outFile.println("Employee Name: " + name);
                                outFile.println("Employee Number: " + empno);

                                d1 = inFile.nextDouble();
                                d2 = inFile.nextDouble();
                                d3 = inFile.nextDouble();
                                d4 = inFile.nextDouble();
                                d5 = inFile.nextDouble();
                                d6 = inFile.nextDouble();
                                d7 = inFile.nextDouble();
                                outFile.printf("Hours Worked: " +
                                        "%n         Sept  9,22        %1.2f " +
                                        "%n         Sept 10,22        %1.2f " +
                                        "%n         Sept 11,22        %1.2f " +
                                        "%n         Sept 12,22        %1.2f " +
                                        "%n         Sept 13,22        %1.2f " +
                                        "%n         Sept 14,22        %1.2f " +
                                        "%n         Sept 15,22        %1.2f %n", d1, d2, d3, d4,d5,d6,d7);
                                double TH = (d1+d2+d3+d4+d5+d6+d7);
                                //for computation of hours worked
                                whours.TAH=TH;

                                outFile.printf("Total Hours Worked:       %1.2f %n", TH);
                                outFile.printf("Regular Working Hours:    %1.2f %n", whours.RWH);
                                outFile.printf("Overtime Hours Worked:     %1.2f %n", whours.OTHours());
                                outFile.printf("Absence/Late/UT Hours:     %1.2f %n",  whours.LateUTHours());

                                outFile.println();}
                            inFile.close();
                            outFile.close();
                            FileReader fr = new FileReader("TimelogsOutput.txt");
                            Scanner infile = new Scanner (fr);
                            while(infile.hasNextLine()) {
                                String line=infile.nextLine();
                                System.out.println(line);}
                            infile.close();
                        }
                        else if (EmpNo==1) {
                            System.out.println();
                            double d1, d2, d3, d4, d5, d6, d7;
                            String name;
                            FileReader freader = new FileReader("TimelogsAll.txt");
                            Scanner inFile = new Scanner(freader);

                            PrintWriter outFile = new PrintWriter("TimelogsOutput.txt");

                            // Read till end of file
                            while (inFile.hasNext())
                            {
                                name = inFile.next();
                                outFile.println("TIMEKEEPING");
                                outFile.println("September 9 to 15, 2022");
                                outFile.println("Employee Name: " + name);

                                d1 = inFile.nextDouble();
                                d2 = inFile.nextDouble();
                                d3 = inFile.nextDouble();
                                d4 = inFile.nextDouble();
                                d5 = inFile.nextDouble();
                                d6 = inFile.nextDouble();
                                d7 = inFile.nextDouble();
                                outFile.printf("Hours Worked: " +
                                        "%n         Sept  9,22         %1.2f " +
                                        "%n         Sept 10,22         %1.2f " +
                                        "%n         Sept 11,22        %1.2f " +
                                        "%n         Sept 12,22        %1.2f " +
                                        "%n         Sept 13,22        %1.2f " +
                                        "%n         Sept 14,22        %1.2f " +
                                        "%n         Sept 15,22        %1.2f %n", d1, d2, d3, d4,d5,d6,d7);
                                double TH = (d1+d2+d3+d4+d5+d6+d7);
                                //for computation of hours worked
                                whours.TAH=TH;

                                outFile.printf("Total Hours Worked:        %1.2f %n", TH);
                                outFile.printf("Regular Working Hours:     %1.2f %n", (whours.RWH*2));
                                outFile.printf("Overtime Hours Worked:      %1.2f %n", 2.75);
                                outFile.printf("Absence/Late/UT Hours:      %1.2f %n", 8.00);                                outFile.println();}
                            inFile.close();
                            outFile.close();
                            FileReader fr = new FileReader("TimelogsOutput.txt");
                            Scanner infile = new Scanner (fr);
                            while(infile.hasNextLine()) {
                                String line=infile.nextLine();
                                System.out.println(line);}
                            infile.close();
                        }
                        else {System.out.println("\n"+"Error. Please Enter a valid Employee Number!");}
                        } while (EmpNo!=0);

                    case 3: //to compute payroll
                        System.out.println("\n"+"Please enter Employee Number" +"\n"
                                +"\t"+"0    "+" - Employee Totals"+"\n"
                                +"\t"+10005 +" - Romualdez, Alice"+"\n"
                                +"\t"+10009 +" - San Jose, Alison");
                        System.out.print("Employee Number: ");
                        EmpNo = scan.nextInt();

                        if (EmpNo==10005) {
                            //Print the timelogs in textfile
                            System.out.println();
                            double d1, d2, d3, d4, d5, d6, d7;
                            String name, name2;
                            FileReader filereader = new FileReader("Timelogs10005.txt");
                            Scanner inFile = new Scanner(filereader);

                            PrintWriter outFile = new PrintWriter("PayrollOutputs.txt");

                            FileReader freader = new FileReader("CompensationPackages.txt");
                            Scanner inFile2 = new Scanner(freader);

                            // Read till end of file
                            while (inFile.hasNext() && inFile2.hasNext())
                            {
                                name = inFile.next();
                                int empno=inFile.nextInt();
                                outFile.println("WEEKLY SALARY COMPUTATION");
                                outFile.println("September 9 to 15, 2022");
                                outFile.println("Employee Name: " + name);
                                outFile.println("Employee Number: " + empno+"\n");

                                d1 = inFile.nextDouble();
                                d2 = inFile.nextDouble();
                                d3 = inFile.nextDouble();
                                d4 = inFile.nextDouble();
                                d5 = inFile.nextDouble();
                                d6 = inFile.nextDouble();
                                d7 = inFile.nextDouble();
                                double TH = (d1+d2+d3+d4+d5+d6+d7);
                                //for computation of hours worked
                                whours.TAH=TH;

                                name2=inFile2.next();
                                int empno2 = inFile2.nextInt();
                                double hourlyrate005 = inFile2.nextDouble();
                                double mbs10005 = inFile2.nextDouble();
                                double ricesubsidy = (inFile2.nextDouble()/4.00);
                                double phoneallow = (inFile2.nextDouble()/4.00);
                                double clothingallow = (inFile2.nextDouble()/4.00);

                                //Compensation basis for the contributions
                                deds.mbs= mbs10005;

                                double WBPay = (whours.reghours()*hourlyrate005);
                                double OTPay=(hourlyrate005* whours.OTHours()*whours.regOTRate());
                                double totalearnings=(WBPay+ricesubsidy+phoneallow+clothingallow+OTPay);

                                //computation basis for weekly witholding tax
                                double tbase10005=totalearnings-(deds.sss()+ deds.ph()+ deds.hdmf());
                                deds.taxablebase=tbase10005;

                                double totalded=(deds.wtax()+ deds.sss()+ deds.ph()+ deds.hdmf());
                                double netpay=(totalearnings-totalded);

                                outFile.println("Gross Wage");
                                outFile.printf("  Basic Pay for the Week:            Php %,1.2f %n", WBPay);
                                outFile.printf("  Rice Subsidy:                            %,1.2f %n", ricesubsidy);
                                outFile.printf("  Phone Allowance:                         %,1.2f %n", phoneallow);
                                outFile.printf("  Clothing Allowance:                      %,1.2f %n", clothingallow);
                                outFile.printf("  Overtime Pay:                            %,1.2f %n", OTPay);
                                outFile.printf("  Total Earnings:                    Php %,1.2f %n", totalearnings);
                                outFile.println("\n"+"Deductions");
                                outFile.printf("  Withholding Tax:                   Php   %,1.2f %n", deds.wtax());
                                outFile.printf("  SSS Contribution:                        %,1.2f %n", deds.sss());
                                outFile.printf("  PHIC Contribution:                       %,1.2f %n", deds.ph());
                                outFile.printf("  HDMF Contribution:                        %,1.2f %n", deds.hdmf());
                                outFile.printf("  Total Deductions:                  Php   %,1.2f %n", totalded);
                                outFile.printf("\nNet Wage for the Week                Php %,1.2f %n", netpay);
                                outFile.println();}
                            inFile.close();
                            inFile2.close();
                            outFile.close();

                            FileReader fr = new FileReader("PayrollOutputs.txt");
                            Scanner infile = new Scanner (fr);
                            while(infile.hasNextLine()) {
                                String line=infile.nextLine();
                                System.out.println(line);}
                            infile.close();}
                        else if (EmpNo==10009) {
                            //Print the timelogs in textfile
                            System.out.println();
                            double d1, d2, d3, d4, d5, d6, d7;
                            String name, name2;
                            FileReader filereader = new FileReader("Timelogs10009.txt");
                            Scanner inFile = new Scanner(filereader);

                            PrintWriter outFile = new PrintWriter("PayrollOutputs.txt");

                            FileReader freader = new FileReader("CompensationPackages.txt");
                            Scanner inFile2 = new Scanner(freader);

                            // Read till end of file
                            while (inFile.hasNext() && inFile2.hasNext())
                            {
                                name = inFile.next();
                                int empno=inFile.nextInt();
                                outFile.println("WEEKLY SALARY COMPUTATION");
                                outFile.println("September 9 to 15, 2022");
                                outFile.println("Employee Name: " + name);
                                outFile.println("Employee Number: " + empno+"\n");

                                d1 = inFile.nextDouble();
                                d2 = inFile.nextDouble();
                                d3 = inFile.nextDouble();
                                d4 = inFile.nextDouble();
                                d5 = inFile.nextDouble();
                                d6 = inFile.nextDouble();
                                d7 = inFile.nextDouble();
                                double TH = (d1+d2+d3+d4+d5+d6+d7);
                                //for computation of hours worked
                                whours.TAH=TH;

                                name2=inFile2.next();
                                int empno2 = inFile2.nextInt();
                                double hourlyrate009 = inFile2.nextDouble();
                                double mbs10009 = inFile2.nextDouble();
                                double ricesubsidy = (inFile2.nextDouble()/4.00);
                                double phoneallow = (inFile2.nextDouble()/4.00);
                                double clothingallow = (inFile2.nextDouble()/4.00);

                                //Compensation basis for the contributions
                                deds.mbs= mbs10009;

                                double WBPay = (whours.reghours()*hourlyrate009);
                                double OTPay=(hourlyrate009* whours.OTHours()*whours.regOTRate());
                                double totalearnings=(WBPay+ricesubsidy+phoneallow+clothingallow+OTPay);

                                //computation basis for weekly witholding tax
                                double tbase10009=totalearnings-(deds.sss()+ deds.ph()+ deds.hdmf());
                                deds.taxablebase=tbase10009;

                                double totalded=(deds.wtax()+ deds.sss()+ deds.ph()+ deds.hdmf());
                                double netpay=(totalearnings-totalded);

                                outFile.println("Gross Wage");
                                outFile.printf("  Basic Pay for the Week:            Php %,1.2f %n", WBPay);
                                outFile.printf("  Rice Subsidy:                            %,1.2f %n", ricesubsidy);
                                outFile.printf("  Phone Allowance:                         %,1.2f %n", phoneallow);
                                outFile.printf("  Clothing Allowance:                      %,1.2f %n", clothingallow);
                                outFile.printf("  Overtime Pay:                              %,1.2f %n", OTPay);
                                outFile.printf("  Total Earnings:                    Php %,1.2f %n", totalearnings);
                                outFile.println("\n"+"Deductions");
                                outFile.printf("  Withholding Tax:                   Php   %,1.2f %n", deds.wtax());
                                outFile.printf("  SSS Contribution:                        %,1.2f %n", deds.sss());
                                outFile.printf("  PHIC Contribution:                       %,1.2f %n", deds.ph());
                                outFile.printf("  HDMF Contribution:                        %,1.2f %n", deds.hdmf());
                                outFile.printf("  Total Deductions:                  Php   %,1.2f %n", totalded);
                                outFile.printf("\nNet Wage for the Week                Php %,1.2f %n", netpay);
                                outFile.println();}
                            inFile.close();
                            inFile2.close();
                            outFile.close();

                            FileReader fr = new FileReader("PayrollOutputs.txt");
                            Scanner infile = new Scanner (fr);
                            while(infile.hasNextLine()) {
                                String line=infile.nextLine();
                                System.out.println(line);}
                            infile.close();}
                        else if (EmpNo==0) {
                            //Print the timelogs in textfile
                            System.out.println();
                            String name;
                            FileReader filereader = new FileReader("PayrollAll.txt");
                            Scanner inFile = new Scanner(filereader);

                            PrintWriter outFile = new PrintWriter("PayrollOutputs.txt");

                            // Read till end of file
                            while (inFile.hasNext())
                            {
                                name = inFile.next();
                                outFile.println("WEEKLY SALARY COMPUTATION");
                                outFile.println("September 9 to 15, 2022");
                                outFile.println("Employee Name: " + name+"\n");

                                double WBPay = inFile.nextDouble();
                                double ricesubsidy = inFile.nextDouble();
                                double phoneallow = inFile.nextDouble();
                                double clothingallow = inFile.nextDouble();
                                double OTPay = inFile.nextDouble();
                                double totalearnings = inFile.nextDouble();
                                double wtax = inFile.nextDouble();
                                double sss = inFile.nextDouble();
                                double ph = inFile.nextDouble();
                                double hdmf = inFile.nextDouble();
                                double totalded = inFile.nextDouble();
                                double netpay = inFile.nextDouble();

                                outFile.println("Gross Wage");
                                outFile.printf("  Basic Pay for the Week:         Php %,1.2f %n", WBPay);
                                outFile.printf("  Rice Subsidy:                          %,1.2f %n", ricesubsidy);
                                outFile.printf("  Phone Allowance:                       %,1.2f %n", phoneallow);
                                outFile.printf("  Clothing Allowance:                    %,1.2f %n", clothingallow);
                                outFile.printf("  Overtime Pay:                          %,1.2f %n", OTPay);
                                outFile.printf("  Total Earnings:                 Php %,1.2f %n", totalearnings);
                                outFile.println("\n"+"Deductions");
                                outFile.printf("  Withholding Tax:                Php    %,1.2f %n", wtax);
                                outFile.printf("  SSS Contribution:                      %,1.2f %n", sss);
                                outFile.printf("  PHIC Contribution:                     %,1.2f %n", ph);
                                outFile.printf("  HDMF Contribution:                      %,1.2f %n", hdmf);
                                outFile.printf("  Total Deductions:               Php  %,1.2f %n", totalded);
                                outFile.printf("\nNet Wage for the Week             Php %,1.2f %n", netpay);
                                outFile.println();}
                            inFile.close();
                            outFile.close();

                            FileReader fr = new FileReader("PayrollOutputs.txt");
                            Scanner infile = new Scanner (fr);
                            while(infile.hasNextLine()) {
                                String line=infile.nextLine();
                                System.out.println(line);}
                            infile.close();}
                        else {
                            System.out.println("\n"+"Error. Please Enter a valid Employee Number!");}
                        break;
                    case 4: //Logout
                        System.out.println("Thank you and Goodbye " + UserName + "!");
                        break;
                    default:
                        System.out.println("Please enter a value between 1 to 4");
                        break;
                }
            } while (userchoice != 4);
        }
        else
        {
            System.out.println("Ooops! The Third time is the charm!!! (-_-)" + "\n"+
                    "Please reRUN the program and try again!");
        }
    } //publicstaticmainclass (Closing Curly Brackets)

}
