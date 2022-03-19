package retryFailedTc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001  {

	
	@Test(retryAnalyzer = retryFailedTc.RetryAnalizer.class )
	public void test1() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, false);
	}
}
