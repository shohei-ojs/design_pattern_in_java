public class bookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;
    
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }
    
    public Book getBookAt(int index) {
        return books[index];
    }
    
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }
}