// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Problema 3");
    System.out.println("Digite um número para descobrir o seu antecessor e o seu sucessor: ");
    Scanner sc = new Scanner(System.in);
    int numeroDigitado = sc.nextInt();

    System.out.println("O número digitado foi " + numeroDigitado + " portanto o seu antecessor é " + (numeroDigitado-1) +
    " e seu sucessor é " + (numeroDigitado+1));
  }
}


