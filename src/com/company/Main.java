package com.company;


import com.company.service.UserService;
import com.company.service.UserServicelmplementation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean template = true;
        System.out.println("Welcome :)");
        UserService service = new UserServicelmplementation();// endi run qil, ko'rdingmi ishladi?
        //tushundingmi?

        while(template)
        {
            System.out.println("1 -> Register\n2 -> List of users\n3 -> Delete user\n4 -> Update user\n5 -> Exit");
            System.out.print("Please enter the number between 1-5: ");
            int number = scanner.nextInt();


            switch (number) {
                case 1 -> service.createUser(); // tushundingmi? yoz shetga y tushundingmi?
                case 2 -> service.getListOfUser(); // tushundingmi?
                case 3 -> System.out.println("Delete user");//Shunda biza  UserServiceImpletentation ichidigifunctionlarni chaqirvommiza, tushundingmi? Singlim?Endu run qil1
                case 4 -> System.out.println("Update user");
                case 5 -> {
                    System.out.println("Application terminated");
                    template = false;
                }
                default -> System.out.println("This number is not in the list");
            }
        }
    }
}

