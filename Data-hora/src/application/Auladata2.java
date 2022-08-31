package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Auladata2 {
	
		public static void main(String[] args) {
		
			LocalDate d01 = LocalDate.now();
			LocalDateTime d02 = LocalDateTime.now();
			Instant d03 = Instant.now();
			// quando é instant tem que formatar especificando o fuzo, se não ele não vai permitir puxar

			LocalDate d04 = LocalDate.parse("2022-07-20");
			LocalDateTime d05 = LocalDateTime.parse("2022-07-20T10:30:45");
			Instant d06 = Instant.parse("2022-07-20T10:30:45Z"); // instant não tem format
			
			DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
			DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
			DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

			
			System.out.println("d04 = " + d04.format(fmt1)); //imprimir direto
			System.out.println("d04 = " + fmt1.format(d04)); //imprimir direto
			System.out.println("d05 = " + d05.format(fmt1));
			System.out.println("d05 = " + d05.format(fmt2));
			System.out.println("d05 = " + d05.format(fmt4));
			System.out.println("d06 = "+ fmt3.format(d06));// chama pelo fmt3
			System.out.println("d06 = "+ fmt5.format(d06));
			System.out.println("d06 = "+ d06.toString());
		}
	}
