package org.naveen.jee6.samples;

import java.util.List;

import com.google.common.collect.Lists;

public class TestUtil {

	public static String format(String message) {
		return String.format("This is a formatted message. %s", message);
	}
	
	public static List<String> getNames() {
		return Lists.newArrayList("Naveen Sisupalan", "Anupama Naveen", "Ananditha Naveen");
	}
	
}
