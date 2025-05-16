public class Book {
    private String title;
    private String author;
    private float price;

    // Getters and Setters
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // toString method for printing book details
    @Override
    public String toString() {
        return "Title: " + title +
                ", Author: " + author +
                ", Price: $" + price;
    }
}
