package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Payroll pay = new Payroll();
    System.out.println("Welcome to the Payroll!");
    System.out.println("Here, we calculate the income you earn");
    System.out.println();

    System.out.println("Please Enter The Number of Hours You Worked:");
    Scanner py = new Scanner(System.in);
    double enteredHours = py.nextDouble();
    System.out.println();

    System.out.println("Please Enter The Number of Dependents You Have:");
    int enteredD = py.nextInt();

    double yourGross = pay.gross(enteredHours);
    double yourSS = pay.socSec(yourGross);
    double yourFI = pay.fedIn(yourGross);
    double yourSI = pay.stIn(yourGross);
    double yourIns = pay.ins(enteredD);
    double yourNet = pay.netIn(yourGross, yourSS, yourFI, yourSI, yourIns);

    System.out.println("Pay Results");
    System.out.println();
    System.out.println("Hours: " + String.format("%.1f", enteredHours));
    System.out.println("Dependents: " + enteredD);
    System.out.println("Rate: $16.78/hr");
    System.out.println("Gross: $" + String.format("%.2f", yourGross));
    System.out.println();

    System.out.println("Social Security: $" + String.format("%.2f", yourSS));
    System.out.println("Federal Income: $" + String.format("%.2f", yourFI));
    System.out.println("State Income: $" + String.format("%.2f", yourSI));
    System.out.println("Union: $10.00");
    System.out.println("Insurance: $" + String.format("%.2f", yourIns));
    System.out.println();

    System.out.println("Net Income: $" + String.format("%.2f", yourNet));
    System.out.println();

    System.out.println("Thank You For Using The Payroll!");
    
  }
}
