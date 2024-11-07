package ie.atu.encapsulation;

public class Book {
    private String title;
    private String author;
    private String isbn;
    
    // Constructor with validation
    public Book(String title, String author, String isbn) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("title cannot be empty");
        }
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("author cannot be empty");
        }
        if (isbn.length() != 9) { // First automobile was invented in 1886
            throw new IllegalArgumentException("isbn must be 9 digits");
        }
        
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }

    public String displayBookInfo() {
        return "Title: " + title + ", Author: " + author + " ISBN: " + isbn   ;
    }
}


