import java.util.*;
public class BookDTO{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     List<Book> list=new ArrayList<>();
     Book obj1=new Book("Mazhai padal", 564, "jayasandhan", 800);
     Book obj2=new Book("Harry Patter", 565, "J.K.Rowling", 850);
     list.add(obj1);
     list.add(obj2);
     showDetails(list);
    }
    public static void showDetails(List<Book> array) {
     for(Book obj:array){
     System.out.println("Book name : "+obj.getBookName()+" ISBN NO : "+obj.getISBN()+" Author name : "+obj.getAuthor()+" Price (Rs) :"+obj.getPrice());
    }
}
}
class Book{
    private String bookName;
    private int  ISBN;
    private String Author;
    private int price;

    public Book(String bookName,int  ISBN,String Author,int price){
        this.bookName=bookName;
        this.ISBN=ISBN;
        this.Author=Author;
        this.price=price;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }
    public int getISBN() {
        return ISBN;
    }
    public String getAuthor() {
        return Author;
    }
    public int getPrice() {
        return price;
    }
}