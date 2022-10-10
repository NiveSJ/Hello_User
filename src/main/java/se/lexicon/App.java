package se.lexicon;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String Name="";

        System.out.println( "Enter your Name" );
        Scanner scan= new Scanner(System.in);
        Name=scan.next();
        System.out.println("Hello"+" "+Name+"!");
    }
}
