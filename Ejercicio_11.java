import java.util.*;
public class Ejercicio_11{
	public static void main(String[] args){
		double cm,y,m,ft,p;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Ingresa valor en centimetros: ");
		cm=scanner.nextDouble();
		y=cm/91.44;
		m=cm/100;
		ft=cm/30.48;
		p=cm/2.54;
		System.out.println("Yardas: "+y);
		System.out.println("Metros: "+m);
		System.out.println("Pies: "+ft);
		System.out.println("Pulgadas: "+p);
	}
}