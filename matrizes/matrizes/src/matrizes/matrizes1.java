package matrizes;
import java.util.Scanner;

public class matrizes1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    double ponto[] = new double[5];
	    double maiorPonto = 0;

	    for (int i = 0; i < 5; i++) {
	      System.out.print("Insira ponto: ");
	      ponto[i] = scanner.nextDouble();
	      System.out.println("Ponto: " + ponto[i]);

	      if(ponto[i] >= maiorPonto){
	        maiorPonto = ponto[i];
	      }
	    }

	    System.out.println("Maior ponto: " + maiorPonto);
	  }
	

}

