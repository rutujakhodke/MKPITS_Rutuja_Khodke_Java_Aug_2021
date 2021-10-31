//2.example of to set the value of id which is greater than 100 only.
class Book{
private int id;
private String title;
private String author;
//creating setter and getter methods.
public void setId(int id){
 if(id>100){
  this.id=id;
 }
 else{
  System.out.println("Id should be greater than 100.");
 }
}
public int getId(){
 return id;
}

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
class TestBook1{
public static void main(String args[]){
Book b1=new Book();
b1.setId(101);
System.out.println("Id is ="+b1.getId());
b1.setTitle("Java");
System.out.println("Title of the Book is ="+b1.getTitle());
b1.setAuthor("Jones");
System.out.println("Author of the Book is ="+b1.getAuthor());
 }
}