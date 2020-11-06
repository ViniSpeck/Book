import java.util.Arrays;

public class Book {
    private String name;
    private Author author[];
    private double price;
    private int qty;


    public Book(){
        setQty(0);
    }

    public Book(String name, Author[] author, double price, int qty) {
        setName(name);
        setAuthor(author);
        setPrice(price);
        setQty(qty);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ",authors=" + Arrays.toString(author) +
                ",price=" + price +
                ",qty=" + qty +
                ']';
    }
}
