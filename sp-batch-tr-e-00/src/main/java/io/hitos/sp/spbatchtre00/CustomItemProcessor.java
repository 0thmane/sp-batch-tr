package io.hitos.sp.spbatchtre00;

import org.springframework.batch.item.ItemProcessor;

import io.hitos.sp.spbatchtre00.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	public Report process(Report item) throws Exception {
		
		System.out.println("Processing..." + item);
		return item;
	}

}