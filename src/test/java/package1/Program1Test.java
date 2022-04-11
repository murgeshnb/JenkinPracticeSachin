package package1;

import org.testng.annotations.Test;

public class Program1Test {
	@Test(groups="smoke")
	public void smokeTest(){
		System.out.println("First output");
		
	}
	
	@Test(groups="regression")
	public void doosRa(){
		System.out.println("Doosraaa.. output");
	}

}
