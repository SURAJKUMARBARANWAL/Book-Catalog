import java.util.List;

public class BookController {

    BookController bookController=new BookController();
    public String addBook(Book book){
        return bookController.addBook(book);
    }
    public List<Book> getAllBooks(String name){
        return bookController.getAllBooks(name);
    }
    public String getAuthWithMostPage(){
        return bookController.getAuthWithMostPage();
    }
}
