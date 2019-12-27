package test.json;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class MainClass3 {
	public static void main(String[] args) {
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("type", "a");
		
		List<String> names=new ArrayList<String>();
		names.add("Winnie");
		names.add("Chloe");
		names.add("Susan");
		
		jsonObj.put("names", names);
		
		String result=jsonObj.toString();
		System.out.println(result);
		
	}
}
