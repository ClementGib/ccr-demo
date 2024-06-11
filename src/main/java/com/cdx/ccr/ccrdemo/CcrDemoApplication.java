package com.cdx.ccr.ccrdemo;

import com.cds.ccr.deal.Deal;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.SparkSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CcrDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcrDemoApplication.class, args);

		SparkSession sparkSession = SparkSession.builder()
				.appName("KCVA Calculator")
				.master("local[*]")
				.getOrCreate();

//		List<Deal> deals = new ArrayList<>();
//		deals.add(new Deal(1000, "2024-12-31", "Entity1", "USD"));
//		deals.add(new Deal(2000, "2025-06-30", "Entity2", "EUR"));
//		deals.add(new Deal(1500, "2023-09-30", "Entity3", "GBP"));
//		deals.add(new Deal(1200, "2026-01-15", "Entity4", "JPY"));
//		deals.add(new Deal(1100, "2027-03-20", "Entity5", "CHF"));
//		deals.add(new Deal(1300, "2028-11-25", "Entity6", "USD"));
//		deals.add(new Deal(9000, "2029-05-18", "Entity7", "EUR"));
//		deals.add(new Deal(1400, "2030-07-10", "Entity8", "GBP"));
//		deals.add(new Deal(1250, "2031-08-22", "Entity9", "JPY"));
//		deals.add(new Deal(1350, "2032-12-13", "Entity10", "CHF"));
//
//		Dataset<Deal> dealDataset = sparkSession.createDataset(deals, Encoders.bean(Deal.class));
//
//		// Write the Dataset to a Parquet file
//		dealDataset.write().parquet("deals.parquet");
//
//		// Stop the Spark session
//		sparkSession.stop();
	}

}
