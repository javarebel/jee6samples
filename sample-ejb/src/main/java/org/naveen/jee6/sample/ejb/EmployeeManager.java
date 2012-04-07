package org.naveen.jee6.sample.ejb;

import javax.ejb.Stateless;

@Stateless
public class EmployeeManager {

	public String greet(String name) {
		return String.format("Hello %s, how are you?", name);
	}
}
