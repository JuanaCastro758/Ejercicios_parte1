import java.util.*;
public class Ejercicio_16{
	public static void main(String[] args){
		int n1,n2,n3;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Ingresa tres numeros: ");
		n1=scanner.nextInt();
		n2=scanner.nextInt();
		n3=scanner.nextInt();
		if (n1>n2 && n1>n3){
			System.out.println("El numero mayor es "+n1);
		}else{
			if (n2>n1 && n2>n3){
				System.out.println("El numero mayor es "+n2);
			}else{
				System.out.println("El numero mayor es "+n3);
			}
		}
	}
}