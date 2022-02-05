package com.api.livros.domain;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class DataAtualSingleton {
	
	public static DataAtualSingleton dataAtual;

	public static DataAtualSingleton getInstance() {
		
		if(dataAtual == null) {
				
			dataAtual = new  DataAtualSingleton();
			
		}
		
		return dataAtual;
		
	}
	
	private DataAtualSingleton() {
	}
	
	public String getDateAsString() {
		
		LocalDateTime stringTime =
		        LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), 
		                                TimeZone.getDefault().toZoneId());
		
		return stringTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		
	}
	
	
}
