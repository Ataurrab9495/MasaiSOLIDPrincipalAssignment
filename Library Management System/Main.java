import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

    }    
}


/* here i have used the SRP principle */


class Book {
    private String title;
    private String author;
    private String ISBN;
    private String genre;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book(String title, String author, String ISBN, String genre){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
    }
}


class Member {
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Member(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void borrowedBooks(Book book){
        borrowedBooks.add(book);
    }

    public List<Book> getBorrowedBooks(){
        return this.borrowedBooks;
    }
}


class Librarian {
    private List<Book> libCollection = new ArrayList<>();

    public void addBook(Book book){
        libCollection.add(book);
    }

    public List<Book> getLibCollection(){
        return this.libCollection;
    }

    public void manageBorrowing(Member m , Book book){
        m.borrowedBooks(book);
    }
}

abstract class FineCalculator {
    public abstract void calculateFine(int daysOverdue);
}

