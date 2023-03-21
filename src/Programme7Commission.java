import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme7Commission {
    public static void main(String[] args) {
        int salesID;
        String sellarsName;
        double salesAmount, salaryBasic, commission, commissionRate = 0;

        Scanner scanner = new Scanner(System.in);//declare scanner
        System.out.println("Input salesID?       ");
        salesID = scanner.nextInt();//store sales ID
        System.out.println("Input sellarsName?   ");
        sellarsName = scanner.next();//store sellars name
        System.out.println("Input basic Salary");
        salaryBasic = scanner.nextDouble();//store salary basic
        System.out.println("Input sales amount?  ");
        salesAmount = scanner.nextDouble();//store sales amount
        scanner.close();

        if (salesAmount >= 50000) {//nested if else for calculating commission
            commissionRate = 0.35;
        } else if (salesAmount >= 30000) {
            commissionRate = 0.20;
        } else if (salesAmount >= 20000) {
            commissionRate = 0.10;
        } else if (salesAmount >= 10000) {
            commissionRate = 0.05;
        } else if (salesAmount < 10000) {
            commissionRate = 0.02;
        }

        commission = commissionRate * salesAmount + salaryBasic;
        System.out.println("Total commission earnt is:" + commission);//total commission including basic salary
    }

}
