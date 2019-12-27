package test.json;

import org.json.JSONObject;

public class MainClass2 {
	public static void main(String[] args) {
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("num",1);
		jsonObj.put("name","Winnie");
		jsonObj.put("isMan",true);
		
		String result=jsonObj.toString();
		System.out.println(result);
		
	}
}
