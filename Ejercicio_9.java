import java.util.*;
public class Ejercicio_9{
	public static void main(String[] args){
		String p1,p2,c;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Ingresa primera palabra: ");
		p1=scanner.nextLine();
		System.out.print("Ingresa segunda palabra: ");
		p2=scanner.nextLine();
		c=p1;
		p1=p2;
		p2=c;
		System.out.println("Primera palabra: "+p1);
		System.out.println("segunda palabra: "+p2);
	}
}