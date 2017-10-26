public class Ejercicio2 {
	public static void main(String args []){
	
		int a=1;
		double d=1.0;
		
		//Operacion1
		
		a=46/9;
		System.out.println(a); //Al ser entero, no muestra el resultado correcto que es 5.11111
		
		//Operacion2
		
		a=46%9 + 4*4-2; //Deberia de dar 15 y da 15
		System.out.println(a);
		
		//Operacion3
		
		a=45+43%5*(23*3%2); //Deberia de dar 48 y da 48
		System.out.println(a);
		
		//Operacion4
		
		a=1;
		a%=3/a+3;
		System.out.println(a);
		
		//Operacion5
		
		d=4+d*d+4;//Deberia de dar 9 y da 9
		System.out.println(d);
		
		//Operacion6
		a=1;
		d=1.0;
		d+=1.5*3+(++a);//Deberia de dar 7.5 y da 7.5
		System.out.println(d);
		
		//Operacion7

	}
}
