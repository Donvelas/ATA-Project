package com.ata;

import java.util.Scanner;

/**
 * Menu class is responsible for greeting the user, 
 * showing a menu to the user for interaction with the application.
 * The class maintains a String[] array of menu options, which it
 * uses for printing the menu to standard out.
 * The class is also responsible for responding to user interaction
 * with respect to its menu.
 */
public class Menu {
    private String[] menuOptions = {"Exit", "List Products", "Buy Product", "Find Product", "Show Cart", "Checkout"};
    private String[] products = {};
    private Scanner scanner;

    /**
     * Class constructor, which expects a Scanner object
     * It allows for the user to specify how a scanner is to
     * be configured outside this class and for basic inversion of 
     * control.
     * @param scanner takes in a Scanner object to initialize
     */

     public Menu(Scanner scanner) {
        this.scanner = scanner;
     }

     /**
      * Prints the menu to standard output, using the class's 
      menuOptions array. 
      * It accepts user input using the encapsulated Scanner instance
      * All output is printed to standard out.
      * All input is collecged from standard in.
      */

      public void executeMenu() {
        do {
            printMenu();

            int menuOpt = getNextIntFromUser();

            if (menuOpt == 0) {
                exit();
                break;
            }

            switch(menuOpt) {
                case 1: 
                    printProducts();
                    break;

                case 2:
                    System.out.println("Not implemented yet, choose another option.");
                    break;

                case 3:
                    System.out.println("Enter the item you are searching for:");
                    break;

                case 4: 
                    System.out.println("Not implemented yet, choose another option.");
                    break;

                case 5:
                    System.out.println(Not implemented yet, choose another option.");
                    break;
            }
        } while(true);
      }

      /**
       * This method prints out the menu options
       */
      private void printMenu() {
        System.out.println();
        System.out.println("--Main Menu--");

        for (i = 0; i < menuOptions.length(); i++) {
            System.out.println(i + ": ");
            System.out.println("menuOptions[i]");
        }
      }

      /**
       * This method prints a exit message and closes the program.
       */
      private void exit() {
        System.out.println("Exiting now, goodbye.");
        scanner.close();
      }
}