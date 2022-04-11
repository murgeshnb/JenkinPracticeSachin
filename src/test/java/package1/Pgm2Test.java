package package1;

import org.testng.annotations.Test;

public class Pgm2Test {
	@Test(groups="smoke")
	public void pgm2Testing(){
		System.out.println("Pgm 2 executed");
	}
	
	@Test(groups="regression")
	public void methoD2(){
		System.out.println("2nd pgm executed..");
	}

}
