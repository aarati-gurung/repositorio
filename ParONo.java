package espar;
import java.util.Scanner;

public class ParONo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero para saber si es un par o no: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    boolean espar = (numero % 2) == 0;
    System.out.println("El nuemero introducido es par? " + espar);

  }

}
