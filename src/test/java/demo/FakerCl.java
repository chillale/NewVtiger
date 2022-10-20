package demo;

import java.util.Date;

import com.github.javafaker.Faker;

public class FakerCl {
	public static void main(String[] args) {
		
		Date date=new Date();
		String d = date.toString();
		System.out.println(d);
		
		String[] arr = d.split(" ");
		String day=arr[0];
		String month=arr[1];
		String date1=arr[2];
		String year=arr[5];
		String exp=day+" "+month+" "+date1+" "+year;
		
		System.out.println(exp);
		
		
		Faker faker=new Faker();
		String fName = faker.name().firstName();
		System.out.println(fName);
		
		String addressCity = faker.address().city();
		System.out.println(addressCity);
		
		Date birthdayDate = faker.date().birthday();
		System.out.println(birthdayDate);
		
		String artistName = faker.artist().name();
		System.out.println(artistName);
		
		String ancientN = faker.ancient().titan();
		System.out.println(ancientN);
	}

}
