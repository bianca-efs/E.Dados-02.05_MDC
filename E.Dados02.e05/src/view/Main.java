package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import controller.Metodos;

public class Main {
	public static void main (String args [ ]) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println ("---------------- CALCULADORA DE MDC ----------------");
		System.out.print ("Digite o primeiro número: ");
		int x = Integer.parseInt(br.readLine());
		System.out.print ("Digite o segundo número: ");
		int y = Integer.parseInt(br.readLine());
		int result = Metodos.calculoMDC(x, y);
		System.out.printf ("O MDC de %d e %d é: %d", x, y, result);
		
	}
}
