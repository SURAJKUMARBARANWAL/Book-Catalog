import java.util.*;

class Repo{
    Map<String, List<Book>> AuthorMap=new HashMap<>();
    Set<Book> bookSet=new HashSet<>();
    public String addBook(Book book){
        bookSet.add(book);
        String autName=book.getAuthor();
        if(AuthorMap.containsKey(autName)){
            AuthorMap.get(autName).add(book);
        }
        else{
            AuthorMap.put(autName,new ArrayList<>());
            AuthorMap.get(autName).add(book);
        }
        return "Successfully added";
    }
    public List<Book> getAllBooks(String name){

        if(AuthorMap.containsKey(name)){
            return AuthorMap.get(name);
        }
        return null;
    }
    public String getAuthWithMostPage(){
        int no_max_page=0;
        String authorName=null;
        for(Map.Entry<String,List<Book>> entry:AuthorMap.entrySet()){
            List<Book> temp=entry.getValue();
            int temp_no_of_page=0;
            for(Book book:temp){
               temp_no_of_page+=book.getNo_of_pages() ;
            }
            if(temp_no_of_page>no_max_page){
                authorName=entry.getKey();
            }

        }
        return authorName;

    }

}