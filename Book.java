/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryRegistrationSystem;

/**
 *
 * @author naseem
 */
public class Book implements Display {
    private String title;
    private String author;
    private String bnum;
    private int copies;
    private boolean isLoaned;

   
    public Book(String title, String author, String bnum, int copies) {
        this.title = title;
        this.author = author;
        this.bnum = bnum;
        this.copies = copies;
        this.isLoaned = false; 
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getbnum() {
        return bnum;
    }

    public int getCopies() {
        return copies;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setbnum(String bnum) {
        this.bnum = bnum;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    public void loanOut() {
        if (!isLoaned && copies > 0) {
            isLoaned = true;
            copies--; // Decrease the available copies
        }
    }
    
    public void returnBook() {
        isLoaned = false;
        copies++; // Increase the available copies
    }
    
    
    @Override
    public String getInfo() {
        return "Title: " + title + ", Author: " + author + ", bnum: " + bnum +
               ", Copies: " + copies + ", Loaned: " + (isLoaned ? "Yes" : "No");
    }

    @Override
    public boolean inLoan() {
        return isLoaned;
    }
}