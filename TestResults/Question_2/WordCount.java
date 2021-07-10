package com.test.wordcount;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) {

		Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
		String str = "This is one String and This String is immutable";

		String[] strArray = str.split(" ");

		for (String s : strArray) {

			if (wordCountMap.containsKey(s)) {
				wordCountMap.put(s, wordCountMap.get(s) + 1);
			} else
				wordCountMap.put(s, 1);

		}

		Set<String> setOfKeys = wordCountMap.keySet();

		System.out.println("Number of occurence of ech words");
		for (String key : setOfKeys) {
			System.out.println(key + ":" + wordCountMap.get(key));
		}

	}

}
