package org.example;

public class Association_Con {

    public static void main(String[] args) {
        Author author = new Author("Zohaib taj");
        Book book = new Book("Arts in Technology", author);
        System.out.println(book.title + " By " +book.author.name);
    }
}

class Author{

    String name;
    Author(String name){
        this.name = name;
    }

}
class Book{
    String title;
    Author author;

    Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }
}
