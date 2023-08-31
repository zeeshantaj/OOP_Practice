package org.example;

import java.util.ArrayList;

public class Book1 {

    String title, author;
    int ISBN;
    private static ArrayList<Book1> list = new ArrayList<>();

    public Book1(String title,String author,int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public static void addBook(Book1 book1){
        list.add(book1);
    }
    public static void removeBook(Book1 book1){
        list.remove(book1);
    }

    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author) {
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    public void setISBN(int ISBN) {
        this.ISBN=ISBN;
    }

    public int getISBN() {
        return ISBN;
    }

    public static ArrayList<Book1> getList() {
        return list;
    }

    public static void main(String[] args) {
        Book1 book1 = new Book1("MBA", "josh kofman", 124567653);
        Book1 book2 = new Book1("MBA1", "josh kofman1", 123457653);

        System.out.println("Book1 "+book1);
        System.out.println("Book2 "+book2);

        Book1.addBook(book1);
        Book1.addBook(book2);

        ArrayList<Book1> book1ArrayList = Book1.getList();

        System.out.println("List of Books");
        for (Book1 book11: book1ArrayList){
            System.out.println(book11.getTitle() + "by" + book11.getAuthor() + "ISBN " + book11.getISBN());
        }
        Book1.removeBook(book1);
        System.out.println("\nAfter removing " + book1.getTitle() + ":");
        System.out.println("List of books:");
        for (Book1 book: book1ArrayList) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }
}
