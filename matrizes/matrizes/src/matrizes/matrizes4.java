package matrizes;
import java.util.Scanner;
public class matrizes4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    int matriz[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
	    int soma = 0;

	    for (int i = 0; i < matriz.length; i++) {
	      soma += matriz[i][i];
	    }

	    System.out.println("Soma: " + soma);

	  }
	

}