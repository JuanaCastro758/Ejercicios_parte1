import java.util.*;
public class Ejercicio_6{
	public static void main(String[] args){
		double n;
		double p;
		n=(Math.random()*200);
		System.out.println("El numero es: "+n);
		p=((30*n)/100)+n;
		System.out.println("Aumentado un 30 porciento es: "+p);
	}
}