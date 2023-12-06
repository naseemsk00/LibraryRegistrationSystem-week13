/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryRegistrationSystem;

/**
 *
 * @author naseem
 */
public class Student {
    private int id;
    private String name;
    private String address;
    private String birthDate;
    private String major;
    private Book[] loanedBooks;
    private int bookCount;

    public Student(int id, String name, String address, String birthDate, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.major = major;
        this.loanedBooks = new Book[3];
        this.bookCount = 0;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getMajor() {
        return major;
    }

    public Book[] getLoanedBooks() {
        return loanedBooks;
    }

    public int getBookCount() {
        return bookCount;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    
    public boolean loanBook(Book book) {
        if (bookCount < 3) {
            loanedBooks[bookCount++] = book;
            return true;
        }
        return false;
    }

  
}
