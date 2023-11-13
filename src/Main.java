public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Иван", "Иванов");
        Author author2 = new Author("Мария", "Петрова");

        Book book1 = new Book("Книга 1", author1, 2000);
        Book book2 = new Book("Книга 2", author2, 2010);

        System.out.println("Книга 1: " + book1.getTitle() + " автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", год издания: " + book1.getYear());
        System.out.println("Книга 2: " + book2.getTitle() + " автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", год издания: " + book2.getYear());

        book2.setYear(2015);
        System.out.println("Обновленная Книга 2: " + book2.getTitle() + " автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", год издания: " + book2.getYear());
    }
}
