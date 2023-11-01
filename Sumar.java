package try_if;
import java.util.Scanner; 

public class Sumar {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("SUMA DE DOS NUMEROS");
    System.out.println("-------------------");
    System.out.println("Introduce el primer numero: ");
    int num1 = Integer.parseInt(sc.nextLine());
    System.out.println("Introduce el segundo numero: ");
    int num2 = Integer.parseInt(sc.nextLine());
    int resultado = num1 + num2;
    System.out.println("La suma de los dos es " + resultado);

  }

}
