
public class Book {
    private String title;
    private String author;
    private int pageCount;
    
    public Book(String author,String title,int pageNumber){
        this.title=title;
        this.author=author;
        this.pageCount=pageNumber;
        
    }
    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.title;
    }
    public int getPages(){
        return this.pageCount;
    }
    @Override
    public String toString(){
        return this.author+", "+this.title+", "+this.pageCount+" pages";
    }
}
