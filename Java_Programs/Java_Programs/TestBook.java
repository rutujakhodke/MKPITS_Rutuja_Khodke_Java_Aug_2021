//1.create a class Book having private fields title and author and methods(setter and getter methods)setTitle(),setAuthor() and getTitle() and getAuthor().
class Book{
 private String title;
 private String author;
 //creating setter and getter methods
 public void setTitle(String title){
  this.title=title;
 }
 public String getTitle(){
  return title;
 }
 public void setAuthor(String author){
  this.author=author;
 }
 public String getAuthor(){
  return author;
  }
}
class TestBook{
public static void main(String args[]){
 Book b1=new Book();
 b1.setTitle("Python");
 System.out.println("Title of the Book is ="+b1.getTitle());
 b1.setAuthor("Martin");
 System.out.println("Author of the Book is ="+b1.getAuthor());
  }
}