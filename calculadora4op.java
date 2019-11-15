package calculadora;

import java.util.*;

public class calculadora4op {

	public static void main(String[] args) {
		// Calculadora simples com as 4 operacoes basicas, usando case
		
		Scanner data = new Scanner(System.in);
		
		int num1,num2;
		String operador;
		
		System.out.println("Informe os dados");
		
		num1 = data.nextInt();
		operador = data.next();
		num2 = data.nextInt();
		
		switch(operador) {
		
		case "+":System.out.println(num1+"+"+num2+"="+(num1 + num2));
		break;
		
		case "-":System.out.println(num1+"-"+num2+"="+(num1 - num2));
		break;
		
		case "x":System.out.println(num1+"x"+num2+"="+(num1 * num2));
		break;
		
		case "/":System.out.println(num1+"/"+num2+"="+(num1 / num2));
		break;
		
		default: System.out.println("Operador invalido!");
		
		}

	}

}
