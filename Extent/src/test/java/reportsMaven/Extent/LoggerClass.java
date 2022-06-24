package reportsMaven.Extent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerClass {

	private static Logger log = LogManager.getLogger(DataDriven.class.getName());

	public static void main(String[] args) {
		log.info("Started program...");
		log.info("FileInputStream created...");
		log.error("Closing workbook...");
		log.debug("Closing workbook...");
		log.fatal("Closing workbook...");
		log.warn("Closing workbook...");
		log.log(null, "full throttle", "yolo sum sum");
	}
}
