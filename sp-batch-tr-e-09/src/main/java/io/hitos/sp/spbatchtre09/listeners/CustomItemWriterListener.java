package io.hitos.sp.spbatchtre09.listeners;


import java.util.List;
import org.springframework.batch.core.ItemWriteListener;

import io.hitos.sp.spbatchtre09.Domain;

public class CustomItemWriterListener implements ItemWriteListener<Domain> {

	
	public void beforeWrite(List<? extends Domain> items) {
		System.out.println("ItemWriteListener - beforeWrite");
	}

	
	public void afterWrite(List<? extends Domain> items) {
		System.out.println("ItemWriteListener - afterWrite");
	}

	
	public void onWriteError(Exception exception, List<? extends Domain> items) {
		System.out.println("ItemWriteListener - onWriteError");
	}

}
