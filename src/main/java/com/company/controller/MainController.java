package com.company.controller;

import com.company.Computer;
import com.company.Laptop;
import com.company.servises.DevisesServise;
import com.company.views.View;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class MainController {
    private final Scanner scanner = new Scanner(System.in);
    private DevisesServise servise;
    private View view = new View();
    int id = 10;
    public MainController(DevisesServise servise) {
        this.servise = servise;
    }
    public void menu() {
        int option;
        do {
            do {
                System.out.println("pick action:");
                System.out.println("1. See List of computers\n" +
                        "2. See list of Laptops\n" +
                        "3. add new computer\n" +
                        "4. add new laptop\n" +
                        "0. EXIT");
                option = getOption();
            } while (option > 4 || option < 0);
            if (option == 0) break;

            executeOption(option);
            //EXECUTE OPTION HERE
        } while (true);

    }
    private int getOption() {
        String str;
        do {
            str = scanner.nextLine().trim();
        } while (!str.matches("\\d"));
        return Integer.parseInt(str);
    }
    public int executeOption(int option) {
        switch (option) {
            case 1:
                return LaptopsList();
            case 2:
                return ComputersList();
            case 3:
                return addComputer();
            case 4:
                return addLaptop();
            default:
                return -1;
        }
    }

    private int LaptopsList() {
        view.showComputers(servise.getComputers());
        return servise.getComputers().size();
    }
    private int ComputersList() {
        view.showLaptops(servise.getLaptops());
        return servise.getLaptops().size();
    }
    private int addComputer() {
        System.out.println("Computer added");
        return servise.saveComputer();
    }
    private int addLaptop() {
        System.out.println("Laptop added");
        return servise.saveLaptop();
    }
}
