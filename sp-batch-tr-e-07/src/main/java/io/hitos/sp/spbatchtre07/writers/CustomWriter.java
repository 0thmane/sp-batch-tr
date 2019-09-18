package io.hitos.sp.spbatchtre07.writers;


import java.util.List;

import org.springframework.batch.item.ItemWriter;

import io.hitos.sp.spbatchtre07.model.Report;


public class CustomWriter<T> implements ItemWriter<T> {

	public void write(List<? extends T> items) throws Exception {
		
		System.out.println("writer..." + items.size());
		Report report = (Report)items.get(0);
		System.out.println(report);
		
	}

}