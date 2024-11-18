public class Library {
    public static void main(String[] args) {
        
    }
}
class LibraryManagementSystem{
    private String userType;
    private String userName;
    private String passWord;
    public LibraryManagementSystem(String userType, String userName, String passWord) {
        this.userType = userType;
        this.userName = userName;
        this.passWord = passWord;
    }
    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean login(String user,String pass,LibraryManagementSystem obj){
        System.out.println("User login successfully !");
        return obj.getUserName().equals(user) && obj.getPassWord().equals(pass);
    }
    public void register(String user,String pass,LibraryManagementSystem obj){
        System.out.println("User registered successfully !");
    }
    public void logOut(){
        System.out.println("User logged out successfully !");
    }

}

class User{
    private String name;
    private String passWord;
    public User(String name ,String passWord){
        this.name=name;
        this.passWord=passWord;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void verify(){
        System.out.println("User account verified successfully !");
    }
    public void checkAccount(){
        System.out.println("User account checked !");
    }
    public void getBookInfo(){
        System.out.println("User holded bookes !");
    }
}
class Student extends User{
    private String name;
    private String passWord;
    public Student(String name, String passWord) {
        super(name, passWord);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    
}
class Staff extends User{
    private String name;
    private String passWord;
    public Staff(String name, String passWord) {
        super(name, passWord);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    
}
class Account{
    private int no_borrowed_books;
    private int no_reserved_books;
    private int no_returned_books;
    private int no_lost_books;
    private int fine;

    public Account(int no_borrowed_books,int no_reserved_books,int no_returned_books,int no_lost_books,int fine){
        this.no_borrowed_books=no_borrowed_books;
        this.no_reserved_books=no_reserved_books;
        this.no_returned_books=no_returned_books;
        this.no_lost_books=no_lost_books;
        this.fine=fine;
    }
    public int getNo_borrowed_books() {
        return no_borrowed_books;
    }
    public void setNo_borrowed_books(int no_borrowed_books) {
        this.no_borrowed_books = no_borrowed_books;
    }
    public int getNo_reserved_books() {
        return no_reserved_books;
    }
    public void setNo_reserved_books(int no_reserved_books) {
        this.no_reserved_books = no_reserved_books;
    }
    public int getNo_returned_books() {
        return no_returned_books;
    }
    public void setNo_returned_books(int no_returned_books) {
        this.no_returned_books = no_returned_books;
    }
    public int getNo_lost_books() {
        return no_lost_books;
    }
    public void setNo_lost_books(int no_lost_books) {
        this.no_lost_books = no_lost_books;
    }
    public int getFine() {
        return fine;
    }
    public void setFine(int fine) {
        this.fine = fine;
    }

    public void CalculateFine(){
        // return getFine()
        System.out.println("User total fine is Rs. xxx");
    }

}

class Book{
    private String title;
    private String author;
    private int ISBN;
    private int publication;
    public Book(String title, String author, int iSBN, int publication) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publication = publication;
    }
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
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public int getPublication() {
        return publication;
    }
    public void setPublication(int publication) {
        this.publication = publication;
    }


    public void reservationStatus(){
        System.out.println("This is your reservation status");
    }
    public void feedBack(){
        System.out.println("Give your feedback");
    }
    public void bookRequest(){
        System.out.println("your request is received");
    }
    public void renewInfo(){
        System.out.println("Book is renewed ");
    }
}

class Librarian{

    private String name;
    private String id;
    private String passWord;
    private String searchBook;

    public Librarian(String name, String id, String passWord, String searchBook) {
        this.name = name;
        this.id = id;
        this.passWord = passWord;
        this.searchBook = searchBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getSearchBook() {
        return searchBook;
    }

    public void setSearchBook(String searchBook) {
        this.searchBook = searchBook;
    }

    public void verifyLibrarian(){
        System.out.println("Your librarian account verified ");
    }
    public void search(){
        System.out.println("Your searched item fetched ");
    }
    
}

class LibraryDataBase{
    
    private String list_of_books;

    public LibraryDataBase(String list_of_books) {
        this.list_of_books = list_of_books;
    }

    public String getList_of_books() {
        return list_of_books;
    }

    public void setList_of_books(String list_of_books) {
        this.list_of_books = list_of_books;
    }

    public void add(){
        System.out.println("Book added");
    } 
    public void delete(){
        System.out.println("Book deleted");
    }
    public void update(){
        System.out.println("Book updated");
    }
    public void search(){
        System.out.println("Book searched");
    }
    public void display(){
        System.out.println("Book displayed");
    }


    
}
