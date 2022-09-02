package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJvmReport(String jsonFile) {
		File file = new File(System.getProperty("user.dir") + "\\target");

		Configuration configuration = new Configuration(file, "Adactin Hotel Automation");

		configuration.addClassifications("Browser", "chrome");
		configuration.addClassifications("Browser version", "105");
		configuration.addClassifications("OS", "Windows 10");
		configuration.addClassifications("Sprint", "34");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}

}
