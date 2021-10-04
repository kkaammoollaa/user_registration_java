  package com.company.service;

  import com.company.model.User;


  import java.util.ArrayList;
  import java.util.Scanner;

  public  class UserServicelmplementation implements UserService{

    ArrayList< User> list = new ArrayList<>();


    @Override
    public void createUser() {
      Scanner scanner =new Scanner( System.in);

      System.out.print("Firstname :");
      String firstname = scanner.next() ;

      System.out.print(" Lastname:");
      String lastname = scanner.next();

      System.out.print( " Age:");
      int age = scanner.nextInt();

      System.out.print(" Weight:");
      Double weight = scanner.nextDouble();

      System.out.print(" Height:");
      Double height = scanner.nextDouble();


      list.add(new User(firstname, lastname, age, height, weight));
      System.out.println("User created successfully!");

    }

    @Override
    public void getListOfUser() {
        System.out.println("List of users:");
        for (User user : list) {
          System.out.println(user.toString());
        }

    }

    @Override
    public void deleteUser() {

    }

    @Override
    public void updateUser() {

    }
  }
