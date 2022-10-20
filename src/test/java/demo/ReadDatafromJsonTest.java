package demo;

import java.io.FileReader;

import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDatafromJsonTest {
	public static void main(String[] args) throws Throwable, ParseException {
		//step1 convert json file into json object
		FileReader fr=new FileReader("./CommonData/CommonDataJson.json/");
		
		//step2 convert json object into java object
		JSONParser jp=new JSONParser();
		 Object jobj=jp.parse(fr);
		 
		 //step3 use hashmap to read the data
		 HashMap hp=(HashMap)jobj;
		String value=(String) hp.get("url");
		System.out.println(value);
		String value1=(String) hp.get("un");
		System.out.println(value1);
		Object value2 = hp.get("pw");
		System.out.println(value2);
	}

}
