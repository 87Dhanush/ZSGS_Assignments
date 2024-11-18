import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe", "123456");
        Book book2 = new Book("Data Structures", "Jane Smith", "7891011");

        Member member1 = new Member("Alice", 1);
        Member member2 = new Member("Bob", 2);
        System.out.println(book1);
        System.out.println(book2);

        System.out.println(member1);
        System.out.println(member2);

        Transaction transaction1 = new Transaction(member1, book1, "Borrow");
        System.out.println(transaction1);

        Transaction transaction2 = new Transaction(member2, book2, "Return");
        System.out.println(transaction2);

        System.out.println(book1.getTitle() + " available: " + book1.isAvailable());
        System.out.println(book2.getTitle() + " available: " + book2.isAvailable());
    }
}
