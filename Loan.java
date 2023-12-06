/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryRegistrationSystem;

/**
 *
 * @author naseem
 */
import java.time.LocalDate;


public class Loan {
    private Student student;
    private Book book;
    private LocalDate dueDate;

    public Loan(Student student, Book book) {
        this.student = student;
        this.book = book;
        this.dueDate = LocalDate.now().plusDays(5);
    }

    
    public Student getStudent() {
        return student;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    
    public void setStudent(Student student) {
        this.student = student;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    
    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }

   
}