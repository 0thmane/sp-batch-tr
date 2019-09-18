package io.hitos.sp.spbatchtre09.listeners;


import org.springframework.batch.core.ItemReadListener;

import io.hitos.sp.spbatchtre09.Domain;


public class CustomItemReaderListener implements ItemReadListener<Domain> {

	
	public void beforeRead() {
		System.out.println("ItemReadListener - beforeRead");
	}

	
	public void afterRead(Domain item) {
		System.out.println("ItemReadListener - afterRead");
	}

	
	public void onReadError(Exception ex) {
		System.out.println("ItemReadListener - onReadError");
	}

}
