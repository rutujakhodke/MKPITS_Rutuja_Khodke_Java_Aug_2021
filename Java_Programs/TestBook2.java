//5.create a readonly class Book having getter methods.
class Book{
 private int id=112;
 private String title="Python";
 //getter method for id and title.
 public int getId(){
	 return id;
 }
 public String getTitle(){
	 return title;
 }
}
class TestBook2{
public static void main(String args[]){
Book b1=new Book();
System.out.println(b1.getId());
System.out.println(b1.getTitle());
}
}