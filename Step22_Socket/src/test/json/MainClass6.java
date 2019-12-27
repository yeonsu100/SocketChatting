package test.json;

import org.json.JSONObject;

public class MainClass6 {
	public static void main(String[] args) {
		String info="{\"num\":1, "
					+"\"name\":\"Winnie\", "
					+"\"addr\":\"Hawaii\"}";
		// json 형식의 문자열을 이용해서 JSONObject 객체를 생성한다.
		JSONObject obj=new JSONObject(info);
		
		// 메소드를 이용해서 원하는 정보 추출하기
		int num=obj.getInt("num");
		String name=obj.getString("name");
		String addr=obj.getString("addr");
	}
}
