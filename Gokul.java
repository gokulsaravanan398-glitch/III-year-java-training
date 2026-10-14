1. Driving Licence Eligibility

import java.util.Scanner;

public class jeeva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String eligibility = age >= 18 ? "Eligible" : "Not Eligible";
        System.out.println(eligibility);

        scanner.close();
    }
}
Output:
Enter your age: 
18
User program finished
Eligible

2.Even number and Range Checker

import java.util.Scanner;

public class jeeva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("The number is divisible by both 2 and 3.");
        } else {
            System.out.println("The number is not divisible by both 2 and 3.");
        }

        scanner.close();
    }
}
Output:

Enter a number: 
13
The number is not divisible by both 2 and 3.


3. Student Pass Checker
import java.util.Scanner;

public class jeeva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        System.out.print("Enter your attendance percentage: ");
        double attendance = scanner.nextDouble();

        String result = marks >= 40 && attendance >= 75 ? "Pass" : "Fail";
        System.out.println(result);

        scanner.close();
    }
}
Output
Enter your marks: 60
Enter your attendance percentage: 80
Pass

4. . Shopping Discount Eligibility

import java.util.Scanner;

public class jeeva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        System.out.print("Is the customer a premium member? (true/false): ");
        boolean isPremiumMember = scanner.nextBoolean();

        String result = purchaseAmount >= 2000 || isPremiumMember
            ? "Discount Available"
            : "No Discount";
        System.out.println(result);

        scanner.close();
    }
}
Output
Enter purchase amount: 5000
Is the customer a premium member? (true/false): true
Discount Available


5. . Password Length Validator
import java.util.Scanner;

public class jeeva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account name: ");
        String accountName = scanner.nextLine();

        System.out.print("Is the account active? (true/false): ");
        boolean isActive = scanner.nextBoolean();

        String result = accountName.length() > 0 && isActive
            ? "Account is active"
            : "Account is inactive or account name is empty";
        System.out.println(result);

        scanner.close();
    }
}
Output
Enter account name: jeeva
Is the account active? (true/false): true
Account is active

6. . ATM Withdrawal Validation

import java.util.Scanner;

public class jeeva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter withdrawal amount: ");
        int withdrawalAmount = scanner.nextInt();

        System.out.print("Enter account balance: ");
        int accountBalance = scanner.nextInt();

        if (withdrawalAmount > 0
                && withdrawalAmount % 100 == 0
                && withdrawalAmount <= accountBalance) {
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }

        scanner.close();
    }
}
Output
Enter withdrawal amount: 5000
Enter account balance: 10000
Withdrawal successful

7. Login Attempt Controller
import java.util.Scanner;

public class jeeva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int maxAttempts = 3;
        int failedAttempts = 0;
        final String correctUsername = "admin";
        final String correctPassword = "1234";

        while (failedAttempts < maxAttempts) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful");
                break;
            }

            failedAttempts++;
            if (failedAttempts < maxAttempts) {
                System.out.println("Login failed. Next attempt is allowed.");
            } else {
                System.out.println("Login failed. Account is locked.");
            }
        }

        scanner.close();
    }
}
Output
Enter username: admin
Enter password: 1234
Login successful

8. . Smart Battery Charging
import java.util.Scanner;

public class jeeva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter battery level (%): ");
        int batteryLevel = scanner.nextInt();

        System.out.print("Enter temperature (C): ");
        double temperature = scanner.nextDouble();

        boolean chargingAllowed = batteryLevel < 90
                && temperature >= 10
                && temperature <= 45;

        if (chargingAllowed) {
            batteryLevel += 5;
        }

        String status = chargingAllowed
                ? "Charging allowed. Battery level: " + batteryLevel + "%"
                : "Charging not allowed";
        System.out.println(status);

        scanner.close();
    }
}
Output
Enter battery level (%): 80
Enter temperature (C): 50
Charging not allowed

9. . Online Order Free Delivery
import java.util.Scanner;

public class jeeva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter order amount: ");
        double orderAmount = scanner.nextDouble();

        System.out.print("Is the customer a premium member? (true/false): ");
        boolean isPremiumMember = scanner.nextBoolean();

        double finalAmount = orderAmount;

        boolean freeDelivery = orderAmount >= 1000 || isPremiumMember;
        if (!freeDelivery) {
            finalAmount += 50;
        }

        System.out.println("Final amount: ₹" + finalAmount);

        scanner.close();
    }
}

Output
Enter order amount: 1000
Is the customer a premium member? (true/false): ture
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:947)
        at java.base/java.util.Scanner.next(Scanner.java:1602)
        at java.base/java.util.Scanner.nextBoolean(Scanner.java:1902)
        at jeeva.main(jeeva.java:11

10. Inventory Reorder Checker
import java.util.Scanner;

public class jeeva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current stock: ");
        int currentStock = scanner.nextInt();

        System.out.print("Enter incoming stock: ");
        int incomingStock = scanner.nextInt();

        System.out.print("Enter minimum stock level: ");
        int minimumStock = scanner.nextInt();

        currentStock += incomingStock;

        String status = currentStock < minimumStock
            ? "Reorder Required"
            : "Stock Sufficient";
        System.out.println("Updated stock: " + currentStock);
        System.out.println(status);

        scanner.close();
    }
}

Output
Enter current stock: 10
Enter incoming stock: 5
Enter minimum stock level: 13
Updated stock: 15
Stock Sufficient

11.Scholarship Eligiblity

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();
        int income = sc.nextInt();
        int points = sc.nextInt();

        int scholarship = (marks >= 95 && income < 200000) ? 100 :
                (marks >= 85 && income < 400000 ||
                 marks >= 90 && points >= 8) ? 50 :
                (marks >= 75) ? 10 : 0;

        System.out.println(scholarship + "% Scholarship");
    }
}
Output 
Enter marks: 80
Enter family income (in rupees): 72500
Enter extracurricular points: 50
Scholarship awarded: 10%

12.Taxi Fare Calculator

import java.util.Scanner;

public class TaxiFareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometres: ");
        double distance = scanner.nextDouble();

        System.out.print("Enter waiting time in minutes: ");
        int waitingMinutes = scanner.nextInt();

        System.out.print("Are you a premium member? (yes/no): ");
        boolean isPremium = scanner.next().equalsIgnoreCase("yes");

        if (distance <= 0 || waitingMinutes < 0) {
            System.out.println("Invalid input: distance must be positive and waiting time cannot be negative.");
            scanner.close();
            return;
        }

        double fare = 50 + (12 * distance);

        if (waitingMinutes > 5) {
            fare += 2 * (waitingMinutes - 5);
        }

        if (isPremium && fare > 300) {
            fare *= 0.90; // Apply 10% discount
        }

        System.out.printf("Total fare: ₹%.2f%n", fare);
        scanner.close();
    }
}
Output
Enter distance in kilometres: 30
Enter waiting time in minutes: 10
Are you a premium member? (yes/no): yes
Total fare: ?378.00

13.Employee Bonus Calculator


import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee salary (₹): ");
        double salary = scanner.nextDouble();

        System.out.print("Enter performance score: ");
        int score = scanner.nextInt();

        System.out.print("Enter completed projects: ");
        int projects = scanner.nextInt();

        int bonusPercentage = (score >= 90 && projects >= 3)
                ? 15
                : (score >= 75 || projects >= 5)
                    ? 10
                    : (score >= 60)
                        ? 3
                        : 0;

        double finalSalary = salary + salary * bonusPercentage / 100.0;

        System.out.println("Bonus percentage: " + bonusPercentage + "%");
        System.out.printf("Final salary: ₹%.2f%n", finalSalary);

        scanner.close();
    }
}

Output
Enter employee salary:750000
Enter performance score:450
Enter completed projects:10
Bonus percentage:15%
final salary:862500.00

14.Secure Transaction Validator

import java.util.Scanner;

public class SecureTransactionValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account balance: ₹");
        double balance = scanner.nextDouble();

        System.out.print("Enter transfer amount: ₹");
        double transferAmount = scanner.nextDouble();

        System.out.print("Enter daily transfer limit: ₹");
        double dailyLimit = scanner.nextDouble();

        System.out.print("Is the account active? (true/false): ");
        boolean accountActive = scanner.nextBoolean();

        if (transferAmount > 0
                && transferAmount <= balance
                && transferAmount <= dailyLimit
                && accountActive) {
            balance -= transferAmount;
            System.out.println("Transaction successful.");
        } else {
            System.out.println("Transaction declined.");
        }

        System.out.printf("Remaining balance: ₹%.2f%n", balance);
        scanner.close();
    }
}

Output:
Enter account balance: ?750000
Enter transfer amount: ?450000
Enter daily transfer limit: ?100000
Is the account active? (true/false): true
Transaction declined.
Remaining balance: ?750000.00

15.Smart Exam Registration System

import java.util.Scanner;

public class SmartExamRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        double attendance = scanner.nextDouble();

        System.out.print("Is there an approved medical certificate? (true/false): ");
        boolean medicalCertificateApproved = scanner.nextBoolean();

        System.out.print("Has the examination fee been paid? (true/false): ");
        boolean feePaid = scanner.nextBoolean();

        System.out.print("Have all assignments been submitted? (true/false): ");
        boolean assignmentsSubmitted = scanner.nextBoolean();

        boolean attendanceEligible = attendance >= 75
                || (attendance >= 65 && medicalCertificateApproved);

        String result = (attendanceEligible && feePaid && assignmentsSubmitted)
                ? "Registration Successful"
                : "Registration Rejected";

        System.out.println(result);
        scanner.close();
    }
}


Output:

Enter attendance percentage: 75
Is there an approved medical certificate? (true/false): true
Has the examination fee been paid? (true/false): false
Have all assignments been submitted? (true/false): true
Registration Rejected