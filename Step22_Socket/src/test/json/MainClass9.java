package test.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class MainClass9 {
	public static void main(String[] args) {
		int num=1;
		String name="Winnie";
		String addr="Hawaii";
		
//		String json="{\"num\":"+num
//					+",\"name\":\""+name+"\","
//					+"\"addr\":\""+addr+"\"}";
		
		// json 문자열로 변환할 값을 JSONObject의 메소드를 이용해서 담은 다음
		JSONObject obj=new JSONObject();
		obj.put("num", num);
		obj.put("name", name);
		obj.put("addr", addr);
		
		// .toString() 메소드를 호출하면 변환된다.
		String json2=obj.toString();
		
		Map<String, Object> map=new HashMap<>();
		map.put("num", 2);
		map.put("name", "Chloe");
		map.put("addr", "CA");
		
		JSONObject obj2=new JSONObject(map);
		String json3=obj2.toString();
		
	}
}
