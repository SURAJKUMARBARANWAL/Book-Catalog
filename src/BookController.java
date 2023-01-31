import java.util.List;

public class BookController {

    Repo repo=new Repo();
    public String addBook(Book book){
        return repo.addBook(book);
    }
    public List<Book> getAllBooks(String name){
        return repo.getAllBooks(name);
    }
    public String getAuthWithMostPage(){
        return repo.getAuthWithMostPage();
    }
}
