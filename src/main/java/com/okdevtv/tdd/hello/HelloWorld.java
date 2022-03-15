package com.okdevtv.tdd.hello;

public class HelloWorld {

	public String getMessage() {
		return "Hello World";
	}
                // ddd
	public String getMessage(String name) {
		if (name == null) {
			name = "World";
		}
		return "Hello " + name;
	}

}
