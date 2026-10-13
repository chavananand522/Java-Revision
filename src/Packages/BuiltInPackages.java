package Packages;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class BuiltInPackages {

	public static void main(String[] args) throws IOException {

//		1. java.util
		ArrayList<String> names = new ArrayList();
		names.add("Dipak");
		names.add("Ajay");
		System.out.println("Names:" + names);

//		2. java.io
		FileWriter fw = new FileWriter("text.txt");
		fw.write("Hello Java");
		fw.close();
		System.out.println("File Created Successfully");

//		3. java.sql
		Date sqlDate = Date.valueOf("2026-10-13");
		System.out.println("SQL Date:" + sqlDate);

//		4. java.time
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println(date);
		System.out.println(time);

	}

}
