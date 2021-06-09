import java.util.*;
public class Ejercicio_20{
	public static void main(String[] args){
		int n;
		String ntxt;
		String c1,c2,c3,c4,c5;
		String unir1,unir2,unir3,unir4;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Ingresa numero: ");
		n=scanner.nextInt();
		ntxt=String.valueOf(n);
        if (n<100000){
        	c1=ntxt.substring(0,1);
	        c2=ntxt.substring(1,2);
	        c3=ntxt.substring(2,3);
	        c4=ntxt.substring(3,4);
	        c5=ntxt.substring(4,5);
	        unir1=c5.concat(c4);
	        unir2=unir1.concat(c3);
	        unir3=unir2.concat(c2);
	        unir4=unir3.concat(c1);
	        int num=Integer.parseInt(unir4);
	        System.out.println(ntxt+","+unir4);
	        if (num==n){
	        	System.out.println("Es Capicua");	
	        }else{
	        	System.out.println("No es Capicua");
	        }
        }else{
			System.out.println("El numero tiene mas de 5 cifras");	
		}
	}
}