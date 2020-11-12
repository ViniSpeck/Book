import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;


    public Book(){
        setQty(0);
    }

    public Book(String name, Author[] authors, double price, int qty) {
        setName(name);
        setAuthors(authors);
        setPrice(price);
        setQty(qty);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
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
                ",authors=" + Arrays.toString(authors) +
                ",price=" + price +
                ",qty=" + qty +
                ']';
    }
    public String getAuthorNames(){
        String authorNames = "";
        for (int i = 0; i < authors.length; i++) {
            authorNames += authors[i].getName();
            if(i< authors.length-1){
                authorNames += ",";
            }
        }
        return authorNames;
    }
}
