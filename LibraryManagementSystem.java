/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



// naseem skafi && osaid mujahed

package LibraryRegistrationSystem;


import java.util.ArrayList;
import java.util.Scanner;





public class LibraryManagementSystem {
       
    private static ArrayList<Book> books = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);
        
        
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    
    public static void main(String[] args) {
       mainMenu();
    }
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    
    
    
    
    
   
    private static void mainMenu() {
        
        System.out.println("Welcome to the Library Management System");
                  
        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Loan a Book");
            System.out.println("4. Check Book Loans");
            System.out.println("5. Exit");
            
            

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    searchBook();
                    break;
                case 3:
                    loanBook(); 
                    break;
                case 4:
                    checkBookLoans();
                    break;
                case 5:
                    System.out.println("Thank you for using the Library Management System.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    
    //case 1
    
    //👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇
     private static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.next();

        System.out.print("Enter book author: ");
        String author = scanner.next();

        System.out.print("Enter book bnum: ");
        String bnum = scanner.next();

        System.out.print("Enter number of copies: ");
        int copies = scanner.nextInt();

        Book book = new Book(title, author, bnum, copies);
        books.add(book);

        System.out.println("Book added successfully.");
    }
    //👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆
    
    
    
     
     
    //case 2
    
    //👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇
     private static void searchBook() {
        System.out.println("\nSearch Book");
        System.out.println("1. Search by title");
        System.out.println("2. Search by author");
        System.out.println("3. Search by bnum");
        System.out.println("4. Return to Main Menu");

        System.out.print("Enter your choice: ");
        int searchChoice = scanner.nextInt();

        switch (searchChoice) {
            case 1:
                searchBookByTitle();
                break;
            case 2:
                searchBookByAuthor();
                break;
            case 3:
                searchBookByBnum();
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
     
     
     
         private static void searchBookByTitle() {
    scanner.nextLine(); 
    System.out.print("Enter book title: ");
    String title = scanner.nextLine();
    
    boolean found = false;
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            System.out.println(book.getInfo());
            found = true;
        }
    }

    if (!found) {
        System.out.println("No book found with the given title.");
    }
        }
     
     
        
     
     private static void searchBookByAuthor() {
    scanner.nextLine(); 
    System.out.print("Enter author's name: ");
    String author = scanner.nextLine();

    boolean found = false;
    for (Book book : books) {
        if (book.getAuthor().equalsIgnoreCase(author)) {
            System.out.println(book.getInfo());
            found = true;
        }
    }

    if (!found) {
        System.out.println("No books found by the given author.");
    }
    }
     
     
     
   
 private static void searchBookByBnum() {
    scanner.nextLine(); 
    System.out.print("Enter book bnum: ");
    String bnum = scanner.nextLine();

    boolean found = false;
    for (Book book : books) {
        if (book.getbnum().equals(bnum)) {
            System.out.println(book.getInfo());
            found = true;
        }
    }

    if (!found) {
        System.out.println("No book found with the given bnum.");
    }
    }
    //👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆
     
 
 
 
 
 
 
 
     //case 3
 
     //👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇
    private static void loanBook() {
    scanner.nextLine(); // Clear the buffer
    System.out.print("Enter book title: ");
    String title = scanner.nextLine();

    boolean found = false;
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            found = true;
            if (!book.isLoaned()) {
                book.loanOut();
                System.out.println("Book loaned successfully.");
            } else {
                System.out.println("This book is already loaned.");
            }
            break;
        }
    }

    if (!found) {
        System.out.println("Book not found.");
    }
}
    //👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆
 
      
      
      
      
      
      
      
     //case 4
 
      //👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇
 
      private static void checkBookLoans() {
    boolean anyBookLoanedOut = false;

    for (Book book : books) {
        String loanStatus = book.isLoaned() ? "Loaned" : "Available";
        System.out.println(book.getInfo() + " - Status: " + loanStatus);
        anyBookLoanedOut = anyBookLoanedOut || book.isLoaned();
    }

    if (!anyBookLoanedOut) {
        System.out.println("No books are currently on loan.");
    }
}
       //👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆👆
    
   
    }//The End