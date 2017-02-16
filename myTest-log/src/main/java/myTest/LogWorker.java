package myTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;

/**
 * Hello world!
 *
 */
public class LogWorker {

	public LogWorker() {

	}

	public LogWorker(String filePath, String fileName) {
		this.filePath = filePath;
		this.fileName = fileName;
	}

	private String filePath;

	private String fileName;

	public void testLog() {
		ConfigurationSource source = null;
		try {
			// System.out.println(":" + new File(".").getAbsolutePath());
			if (filePath != null && fileName != null) {
				source = new ConfigurationSource(new FileInputStream(filePath + "/" + fileName));
			} else {
				source = new ConfigurationSource(new FileInputStream("src/main/webapp/WEB-INF/log4j2-worker1.xml"));
			}
			Configurator.initialize(null, source);
			Logger logger = LogManager.getLogger(LogWorker.class);
			System.out.println(":==================================");
			logger.warn("!!!");
			logger.error("!!!");
			logger.debug("!!!");
			System.out.println(":==================================");
			LogManager.shutdown();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
