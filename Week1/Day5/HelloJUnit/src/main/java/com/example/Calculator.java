package com.example;

public class Calculator {
	
	public boolean magic = false;
	
	public static void main(String...args) {
		Calculator calc = new Calculator();
		
		int[] array = {1,2,3};
		
		System.out.println(calc.add(1,2,3,4));
		System.out.println(calc.add(array));
		
	}
	
	public int add(int x) {
		return x;
	}
	
	public int add(int x, int y) {
		return x +y;
	}
	
	public int add(int x, int y, int z) {
		return x + y +z;
	}
	
	public void turnOnMagic() throws InterruptedException {
		this.magic = true;
	}
	
	public void turnOffMagic() {
		this.magic = false;
	}
	
	public void troublesome() {
		//logger.ERROR("very troublesome");
		throw new IllegalAccessError();
	}
	
//	public int add(int[] arrayInt) {
//		return 0;
//	}
	
	//var-args, allows us to pass in multiple arguments
	public int add(int...a) {
		return 127;
	}

}
