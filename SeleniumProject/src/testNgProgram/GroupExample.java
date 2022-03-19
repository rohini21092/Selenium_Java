package testNgProgram;

import org.testng.annotations.Test;

public class GroupExample {

	@Test(groups="Regression")
	public void testCase1() {
		System.out.println("regrassion test case one executed");
	}
	

	@Test(groups="Regression")
	public void testCase2() {
		System.out.println("regrassion test case one executed");
	}
	

	@Test(groups="Sanity")
	public void testCase3() {
		System.out.println("sanity test case one executed");
	}
	

	@Test(groups="Smoke")
	public void testCase4() {
		System.out.println("Smoke test case one executed");
	}
}
