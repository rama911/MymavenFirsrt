package com.rama.collections;

import java.util.HashMap;
import java.util.Map;

public class MapColl {
	
	
	
	public static void main(String[] args) {
		Map<String , String> languages = new HashMap<>();
		languages.put("Java", "a compiled high level, object-oriented, platform independent language");
		languages.put(".net", "This is a object based program");
		languages.put("Unix", "This is a language developed on complete C");
		
		
		if(languages.containsKey("Java")) {
			languages.replace("Java", "a compiled high level, object-oriented, platform independent language", "Java is strong");
			System.out.println("Java is replaced");
		}else {
			System.out.println("java not found");
		}
		
		for(String key : languages.keySet()) {
			System.out.println(key+" : "+languages.get(key));
		}
	}

}
