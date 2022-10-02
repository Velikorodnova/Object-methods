public class Main {
    public static void main(String[] args) {
        Author author_1 = new Author("Джоан", "Роулинг");
        Author author_2 = new Author("Стивен", "Кинг");
        Book book1 = new Book("Гарри Поттер и узник Азкабана", author_1, 1999);
        Book book2 = new Book("Дьюма-Ки", author_2, 2008);
        System.out.println(book1);
        System.out.println(book2);
    }
}