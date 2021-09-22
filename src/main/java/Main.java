import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws FileNotFoundException {
        
        
        Utils ut = new Utils();
        System.out.println("The cube of 5 is "+ut.getCube(5));
        System.out.println("The 8 is prime"+ Utils.isPrime(8));
        System.out.println("Read from file m.txt value of "
             + ut.getIntFromFile("c://d//m.txt"));
    }
}
