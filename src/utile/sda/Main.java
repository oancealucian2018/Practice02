package utile.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double minutesInYear = 60*24*365;
	Scanner scanner = new Scanner(System.in);
    System.out.println("Introduceti nr de minute: ");

    double minutes = scanner.nextInt();
    long years =(long)(minutes/minutesInYear);
    int days = (int)(minutes/60/24)%365;

    System.out.println((int )minutes+ " minutes is approximately "+days +" days and "+years+" years.");
    }
}
