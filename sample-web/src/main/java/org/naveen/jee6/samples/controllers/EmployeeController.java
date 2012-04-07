package org.naveen.jee6.samples.controllers;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.naveen.jee6.sample.ejb.EmployeeManager;
import org.naveen.jee6.samples.GreetingManager;
import org.naveen.jee6.samples.TestUtil;

@RequestScoped
@ManagedBean(name="empMgr")
public class EmployeeController implements Serializable {

	private static final long serialVersionUID = 7991268667107117583L;
	
	private String name;
	private String greetMsg;
	private String helloMsg;
	private String formatMsg;
	
	@EJB
	private EmployeeManager empMgr;
	
	@EJB
	private GreetingManager greetmgr;
	
	public String greet() {
		this.greetMsg = empMgr.greet(this.name);
		this.helloMsg = greetmgr.sayHello(this.name);
		this.formatMsg = TestUtil.format("Format this message");
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreetMsg() {
		return greetMsg;
	}

	public void setGreetMsg(String greetMsg) {
		this.greetMsg = greetMsg;
	}

	public String getHelloMsg() {
		return helloMsg;
	}

	public void setHelloMsg(String helloMsg) {
		this.helloMsg = helloMsg;
	}

	public String getFormatMsg() {
		return formatMsg;
	}

	public void setFormatMsg(String formatMsg) {
		this.formatMsg = formatMsg;
	}
}
