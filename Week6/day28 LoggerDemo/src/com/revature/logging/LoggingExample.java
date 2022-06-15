package com.revature.logging;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class LoggingExample {

	/* Get the class name to be printed on */
	static Logger log = Logger.getLogger(LoggingExample.class.getName());

	public static void main(String[] args) throws IOException, SQLException {
		log.debug("Hello this is a debug message");
		log.info("Hello this is an info message");
	}
}
