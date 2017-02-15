package myTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.Assert;
import org.junit.Test;

public class Log2Test {

	@Test
	public void testLog() {
		ConfigurationSource source = null;
		try {
			// System.out.println(":" + new File(".").getAbsolutePath());
			source = new ConfigurationSource(new FileInputStream("src/test/resources/xml/log4j2-2.xml"));
			Configurator.initialize(null, source);
			Logger logger = LogManager.getLogger(Log2Test.class);
			System.out.println(":==================================");
			logger.warn("!!!");
			logger.error("!!!");
			logger.debug("!!!");
			System.out.println(":==================================");
			LogManager.shutdown();
			source = new ConfigurationSource(new FileInputStream("src/test/resources/xml/log4j2-1.xml"));
			Configurator.initialize(null, source);
			Logger logger2 = LogManager.getLogger(Log2Test.class);
			System.out.println(":==================================");
			logger2.warn("!!!");
			logger2.error("!!!");
			logger2.info("!!!");
			logger2.debug("!!!");
			System.out.println(":==================================");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Assert.assertTrue(true);
	}

}
