package myTest;

import org.junit.Assert;
import org.junit.Test;

public class ServletTest {

	@Test
	public void testLog() {
		LogWorker logWorker = new LogWorker();
		logWorker.testLog();
		Assert.assertTrue(true);
	}

}
