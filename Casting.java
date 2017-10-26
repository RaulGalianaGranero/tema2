public class Casting {
	public static void main(String args []){
		//Conversiones casting implicitas
		
		int x=6;
		double y=23;
		y*=x*x;
		System.out.println("El resultado es " + y);
		
		float z=24; //Lo lee como INT y lo castea en un float (ambos tienen 4 bits)
		z/=x;
		System.out.println("El resultado es "+z);
		}
}
