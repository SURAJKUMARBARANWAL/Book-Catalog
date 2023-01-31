public class Book {
    private String name;
    private String author;
    private int no_of_pages;
    private double rating;

    public Book(String name, String author, int no_of_pages, double rating) {
        this.name = name;
        this.author = author;
        this.no_of_pages = no_of_pages;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNo_of_pages() {
        return no_of_pages;
    }

    public void setNo_of_pages(int no_of_pages) {
        this.no_of_pages = no_of_pages;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
