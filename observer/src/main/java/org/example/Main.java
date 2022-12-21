package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var service = new Service();
        Scanner scanner = new Scanner(System.in);

        Employee Iv = new Employee("Иван Иванов", service);
        Employee P = new Employee("Петр Петров", service);
        String mess = scanner.nextLine();
        service.setMessage(mess);
        service.removeObserver(Iv);
        mess = scanner.nextLine();
        service.setMessage(mess);
    }
}