import java.util.*;
public class Ejercicio1{
	public static void main(String args []){
		double millas ;
		final double MILLAS_POR_KILOMETRO=1.609;
		double kilometro;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce una cantidad en millas para pasarlo a kilometros:");
		millas=sc.nextDouble();
		
		kilometro= millas*MILLAS_POR_KILOMETRO;
		
		System.out.println(millas+"m son "+ kilometro+" km");		
		
		}
	}
