//2.create an array to store 5 productname and price and display the product name and pass array to method to calculate price.
import java.util.*;
public class ArraytoMethodEx2 {
    void calculatePrice(int pr[]) {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total = total + pr[i];
        }
        System.out.println("Total price of products are: " + total);
    }

    public static void main(String[] args) {
        String pname[] = new String[5];
        int price[] = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a 5 product Name: ");
            pname[i] = scan.nextLine();
        }
        for (int j = 0; j < 5; j++) {
            System.out.println("Enter a 5 Product Price: ");
            price[j] = scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Product names are: " + pname[i]);
        }
        ArraytoMethodEx2 array = new ArraytoMethodEx2();
        array.calculatePrice(price);
    }

}
