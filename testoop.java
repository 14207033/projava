package oop.car;

public class testoop {
	public static void main(String[] args) {
		Suzuki s=new Suzuki();
	//	s.carBrand();
		Toyota t=new Toyota();
	//	t.carBrand();

		printbrand(s);


		Bmw bmw=new Bmw();
		bmw.run();
		
	}

	public static	void printbrand(ICar obj) {
		obj.carBrand();
	}	
}

class Bmw extends Auto {

}

class Suzuki implements ICar {
	@Override
	public void carBrand() {
		System.out.println("Suzuki");
	}
}

class Toyota implements ICar { 
	@Override
	public void carBrand() {
		System.out.println("Toyota");
	}

}
