package org.example.lab2.input;


import org.example.lab2.dataStorage.DataStorage;
import org.example.lab2.model.UserPojo;

import java.util.Objects;
import java.util.Scanner;

public class ReadFromKeyboard {
    private Scanner scanner;

    public ReadFromKeyboard() {
        this.scanner = new Scanner(System.in);
    }

    public void create() {
        System.out.print("Enter username: ");
        String username = this.scanner.next();

        System.out.print("Enter sold: ");
        int sold = this.scanner.nextInt();

        UserPojo user = new UserPojo(username, sold);
        DataStorage.Users.add(user);

        System.out.println("Username: " + user.getUsername());
        System.out.println("Sold: " + user.getSold());
    }

    public void update(UserPojo user) {

        System.out.print("Enter new username: ");
        String username = this.scanner.next();

        System.out.print("Enter new sold: ");
        int sold = this.scanner.nextInt();

        user.setUsername(username);
        user.setSold(sold);


        System.out.println("Username: " + user.getUsername());
        System.out.println("Sold: " + user.getSold());
    }

    public void menu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    this.create();
                    System.out.println();
                    break;
                case 2:

                    for(int i=0;i<DataStorage.Users.size();i++)
                        System.out.println(i + "." + DataStorage.Users.get(i).getUsername() + "," + DataStorage.Users.get(i).getSold());
                    System.out.println();
                    break;

                case 3:

                    System.out.print("Enter username: ");
                    String username = this.scanner.next();

                    for(int i=0;i<DataStorage.Users.size();i++)
                        if (Objects.equals(DataStorage.Users.get(i).getUsername(), username))
                        {
                            this.update(DataStorage.Users.get(i));
                        }


                    System.out.println();

                    break;


                case 4:

                    System.out.print("Enter username: ");
                    username = this.scanner.next();

                    for(int i=0;i<DataStorage.Users.size();i++)
                        if (Objects.equals(DataStorage.Users.get(i).getUsername(), username))
                        {
                            DataStorage.Users.remove(DataStorage.Users.get(i));
                        }


                    System.out.println();


                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.out.println();
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid command.");
                    System.out.println();
            }
        }

        this.scanner.close();
    }
}