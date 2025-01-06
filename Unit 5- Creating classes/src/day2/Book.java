package day2;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    //Constructors
    public Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    public Book(String title, String author){
        this.title = title;
        this.author= author;
        price = 9.99;
        yearPublished = 2000;
    }
    public Book(String title){
        this.title = title;
        author = "Unknown author";
        yearPublished = 2000;
        price = 9.99;
    }

    //Methods
    public void displayDetails(){
        System.out.println("title: " + title + "author: " + author + "year: " + yearPublished + "price: " + price);
    }
    public void displayDetails(boolean showTitleAndAuthorOnly){
        if(showTitleAndAuthorOnly){
            System.out.println("Title: " + title + "Author: " + author);
        }
        else{
            displayDetails();
        }

    }
    public void displayDetails(String showTitleOnly){
        title = showTitleOnly;
        System.out.println("Title: " + showTitleOnly);
    }
}
