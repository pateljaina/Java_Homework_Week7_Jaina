/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================
 */

import java.util.Scanner;

public class Programme5SalarySlip {
    public static void main(String[] args) {
        String EmployeeName;//declare variables to be input into scanner
        int EmpID;
        double basicsalary;
        double HRA;
        double DA;
        double TA;
        double PF;
        Scanner scanner = new Scanner(System.in); //declare scanner
        System.out.println("Enter Employee ID:      "); //Save Employee ID input
        EmpID = scanner.nextInt();

        System.out.println("Enter Employee name:          ");//Save Employee Name input
        EmployeeName = scanner.next();

        System.out.println("Enter basic salary:        ");//Save Basic Salary figure
        basicsalary = scanner.nextDouble();

        HRA = (basicsalary * 10) / 100;//store different figures based on %of Basic Salary
        DA = (basicsalary * 8) / 100;
        TA = (basicsalary * 9) / 100;
        PF = (basicsalary * 20) / 100;

        double GrossS = (basicsalary + (HRA + TA + DA) - PF); //Calculate and Store Gross Salary Figure

        System.out.println("|-------------------------------------------------------------------|");
        System.out.println("|                          Salary Slip                              |");
        System.out.println("|-------------------------------------------------------------------|");
        System.out.println("|EmployeeID                        :" + EmpID + "                   |");
        System.out.println("|Employee Name                     :" + EmployeeName + "            |");
        System.out.println("|-------------------------------------------------------------------|");
        System.out.println("|Basic Salary                      :" + basicsalary + "             |");
        System.out.println("|HRA 10%                           :" + HRA + "                     |");
        System.out.println("|DA 8%                             :" + DA + "                      |");
        System.out.println("|TA 9%                             :" + TA + "                      |");
        System.out.println("|PF-20&                            :" + PF + "                      |");
        System.out.println("|-------------------------------------------------------------------|");
        System.out.println("|Gross Salary                      :" + GrossS + "                  |");
        System.out.println("|===================================================================|");
        scanner.close();
    }

}
