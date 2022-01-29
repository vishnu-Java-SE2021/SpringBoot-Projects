//Engine.java
package com.vit.beans;

import org.springframework.stereotype.Component;

@Component("eng") //bean id with "eng" is created and stored in IOC container
public interface Engine {
	public void start();
	public void stop();
}
