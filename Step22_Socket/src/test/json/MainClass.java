package test.json;

import org.json.JSONArray;		// 추가한 레퍼런스드 라이브러리

public class MainClass {
	public static void main(String[] args) {
		JSONArray jsonArr=new JSONArray();
		jsonArr.put("Winnie");
		jsonArr.put("Chloe");
		jsonArr.put("Susan");
		
		// JSONArray 객체 안에 있는 정보를 JSON 문자열로 얻어내기
		String result1=jsonArr.toString();
		System.out.println(result1);
	}
}
