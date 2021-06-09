import java.util.*;
public class Ejercicio_19{
	public static void main(String[] args){
		int n;
		Random aleatorio = new Random();
		n=aleatorio.nextInt(1000-1+1)+1;

		if (n % 2==0){
			if (n<26){
				System.out.println("Correcto");
			}
		}else{
			System.out.println("Incorrecto");
		}

	}
}