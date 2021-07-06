package dao;

import java.util.HashMap;

public class Session {
	private static HashMap<String, String> datas = new HashMap<>();
	
	public static void put(String key,String value) {
		datas.put(key, value);
	}
	
	public static String get(String key) {
		return datas.get(key);
	}
	
}