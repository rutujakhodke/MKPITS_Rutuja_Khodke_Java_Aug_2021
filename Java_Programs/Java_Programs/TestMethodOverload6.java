//7.we can overload java main method.
class TestMethodOverload6{
public static void main(String[] args){
System.out.println("main with string[]");
main("abc");
}
public static void main(String args){
System.out.println("main with string");
main();
}
public static void main(){
System.out.println("main without arguments");
 }
}