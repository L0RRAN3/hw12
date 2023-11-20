public class Book {
    public Book(String s, Author author1, int i) {
    }

    public static void main(String[] args) {
        Author author1 = new Author("Иван", "Иванов");
        Author author2 = new Author("Мария", "Петрова");

        Book book1 = new Book("Книга 1", author1, 2000);
        Book book2 = new Book("Книга 2", author2, 2010);

        System.out.println("Книга 1: " + book1.getTitle() + " автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", год издания: " + book1.getYear());
        System.out.println("Книга 2: " + book2.getTitle() + " автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", год издания: " + book2.getYear());

        book2.setYear();
        System.out.println("Обновленная Книга 2: " + book2.getTitle() + " автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", год издания: " + book2.getYear());
    }
}