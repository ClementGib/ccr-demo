package com.cdx.ccr.core.demo;

import com.cds.ccr.processing.spark.SparkConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreDemoApplication {

	public static void main(String[] args) {
			SpringApplication.run(CoreDemoApplication.class, args);
		SparkConfig sparkConfig = new SparkConfig();
	}
}
