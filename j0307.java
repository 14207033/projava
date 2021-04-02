public class j0307 {
	public static void main(String[] args){
		System.out.println("java0307");
		Che car = new Che();
		car.getcar();
	} 
}


class Che {
	public String cname="suzuki";
	public double cprice=10.5;

	public void getcar(){
		System.out.println("this car is:"+cname);
		System.out.println("It cost:"+cprice);
	}		
}
