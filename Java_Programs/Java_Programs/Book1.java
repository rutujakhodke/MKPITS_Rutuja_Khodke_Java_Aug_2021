//7.create a write-only class Book having setter methods.
class Book1{
private int id;
private String title;
//setter method for id and title.
public void setId(int id){
 this.id=id;
}
public void setTitle(String title){
 this.title=title;
 }
 public void display(){
 System.out.println(id+" "+title);
 }

 public static void main(String args[]){
 Book b1=new Book();//create instance of encapsulated class.
 b1.setId(112);//calling setId() method.
 b1.setTitle("Oracle");
 b1.display();
 }
}


