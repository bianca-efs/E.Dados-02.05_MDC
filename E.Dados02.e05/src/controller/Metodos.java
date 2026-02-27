package controller;

public class Metodos {
	
	public static int calculoMDC(int x, int y) {
		
		if (x == y) {
			return x;	
			
		} else if (x > y) {
	         return calculoMDC(x - y, y);
	         
	     } else {
	         return calculoMDC(y, x);
	     }
	}
	
}
