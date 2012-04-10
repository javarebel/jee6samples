package org.naveen.jee6.samples;

import java.io.Serializable;
import java.util.Iterator;
import java.util.ServiceLoader;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("test")
@RequestScoped
public class TestController implements Serializable {

	private static final long serialVersionUID = 1370383998169604518L;
	
	private String param;
	private String output;
	
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	
	public String echo() {
		System.out.println("Echo Request received ..........................");
		ServiceLoader<EchoService> loader = ServiceLoader.load(EchoService.class);
		Iterator<EchoService> serviceIter = loader.iterator();
		EchoService service = null;
		while(serviceIter.hasNext()) {
			service = serviceIter.next();
			System.out.println("Echo Service Implementation is " + service.getClass().getName());
			this.output = service.echo(this.param);
		}
		return null;
	}
}
