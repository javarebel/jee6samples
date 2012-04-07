package org.naveen.jee6.samples;

import javax.ejb.Stateless;

@Stateless
public class GreetingManager {

	public String sayHello(String name) {
		return String.format("Hello %s", name);
	}
}
