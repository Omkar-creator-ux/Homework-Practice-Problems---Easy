public class Qnoseven {
    String title;
    String author;
  
    Qnoseven(String t,String a){
        title = t;
        author = a;
    }

static void showBook(Qnoseven book){
    System.out.println("Title: " + book.title);
    System.out.println("Author: " + book.author);
}

public static void main(String[] args) {
    Qnoseven book1 = new Qnoseven("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
    showBook(book1);
}
}
