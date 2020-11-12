public class BookTest {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Abraham Silberschatz", "silberschatz@example.com", 'm');
        authors[1] = new Author("R. Korth", "korth@example.com", 'm');

        Book databases = new Book("Sistema de Banco de Dados", authors, 109.99, 99);
        System.out.println(databases);
        System.out.println(databases.getAuthorNames());

    }

}
