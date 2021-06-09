import java.util.*;
public class Ejercicio_10{
	public static void main(String[] args){
		float b,h,a,p;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Ingresa base: ");
		b=scanner.nextFloat();
		System.out.print("Ingresa altura: ");
		h=scanner.nextFloat();
		if ((h>0) && (b>0)){
			p=(2*b)+(2*h);
			a=b*h;
			System.out.println("area: "+a);
			System.out.println("perimetro: "+p);
		}else{
			System.out.println("Los datos no son validos");
		}
	}
}