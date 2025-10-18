/* Create a Book class for a library system.
• Instance variables: title, author, isbn.
• Static variable: totalBooks, a counter for the total number of book instances.
• Instance methods: borrowBook(), returnBook().
• Static method: getTotalBooks(), to get the total number of books in the
library. */
public class Book {
    static int totalNoOfBooks;

    String author;
    String title;
    String isbn;

    boolean isBorrow;

    static {
        totalNoOfBooks=0;
    }
    { // Object Initializer
        totalNoOfBooks++;
    }

    Book(String isbn,String title, String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }

    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }

    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if(isBorrow){
            System.out.println("Book is already Borrowed");
        }else {
            this.isBorrow=true;
            System.out.println("Enjoy the"+ this.title  );
        }
    }

    void returnBook(){
        if(isBorrow){
            this.isBorrow=false;
            System.out.println("Hope you enjoy the Book");
        }else {
            System.out.println("This book is already in the liberary");
        }
    }

    public static void main(String[] args) {
        Book designOfThings= new Book("1","Design","Author");
        Book myBook= new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        myBook.returnBook();
    }
}