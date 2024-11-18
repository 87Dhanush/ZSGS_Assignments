package library.transactions;

import library.books.Book;
import library.members.Member;

import java.util.Date;

public class Transaction {
    private Member member;
    private Book book;
    private Date transactionDate;
    private String transactionType;

    public Transaction(Member member, Book book, String transactionType) {
        this.member = member;
        this.book = book;
        this.transactionDate = new Date();
        this.transactionType = transactionType;
        if (transactionType.equals("Borrow")) {
            book.setAvailability(false);
        } else if (transactionType.equals("Return")) {
            book.setAvailability(true);
        }
    }

    @Override
    public String toString() {
        return "Transaction{Member: " + member.getName() + ", Book: " + book.getTitle() + ", Type: " + transactionType + ", Date: " + transactionDate + "}";
    }
}
