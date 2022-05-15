package com.kpinc.splog4j2.ex;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Splog4j2exApplication implements CommandLineRunner {
	private static final Logger log = LogManager.getLogger(Splog4j2exApplication.class);
	public static void main(String[] args) {
		log.info("STARTING SPRING BOOT APP ======================LOG4J LOG");
		SpringApplication.run(Splog4j2exApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		log.info("Hey! I am INFO log from log4j2 ...");
		log.debug("Haha! I am DEBUG log from log4j2 ...");
	}

}
