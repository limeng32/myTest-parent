package myTest;

import org.junit.Assert;
import org.junit.Test;

public class LogTest {

	private static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager
			.getLogger(LogTest.class.getName());

	@Test
	public void testLog() {
		logger.warn(":warn");
		logger.error(":error");
		Assert.assertTrue(true);
	}

}
