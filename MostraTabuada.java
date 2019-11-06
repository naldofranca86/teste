package tabuada;

import java.util.Scanner;



public class MostraTabuada {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		System.out.println("Informe qual tabuada exibir:");
		int tabuada = data.nextInt();
		System.out.println("Ate qual valor exibir?\n");
		int interacao = data.nextInt();
		int i;			

		for (i = 0;i <= interacao;i++){
			System.out.println(tabuada+" x "+i+" = "+(i * tabuada));			
		}

	}

}
