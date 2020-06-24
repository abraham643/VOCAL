package vocales;
import java.util.Scanner;
public class Vocales {
    public static void main(String[] args) {
   int vocal; 
   String frase; 
   Scanner entrada = new Scanner (System.in); 
   vocal=0; 
   System.out.println ("ingresé alguna frase"); 
   frase= entrada.nextLine().toLowerCase(); 
   
   for ( int x = 0; x< frase.length(); x++)
   {
     if (frase.charAt(x) == 'a' ||frase.charAt(x)== 'e' || frase.charAt(x) == 'i' || frase.charAt(x) == 'o' || frase.charAt(x) == 'u' ) 
     { vocal++; }
     
   }
   System.out.println ("la frase tiene el siguiente numero de vocales:"   );
   System.out.println (+vocal); 
  }
}