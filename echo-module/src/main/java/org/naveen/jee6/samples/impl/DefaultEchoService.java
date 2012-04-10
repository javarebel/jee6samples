package org.naveen.jee6.samples.impl;

import org.naveen.jee6.samples.EchoService;

public class DefaultEchoService implements EchoService {

	@Override
	public String echo(String arg0) {
		return "Echoing back....." + arg0;
	}
	
}
