//2.Example of java Serialization.create a class Student and create its object which can be serialized int byte stream.create a class Persist1
//for serialization of object.create another class DePersist1 for deserialization of reconstructing object from byte stream.
import java.io.*;
 class Student14 implements Serializable{
 int id;
 String name;
 public Student14(int id,String name){
  this.id=id;
  this.name=name;
 }
}
