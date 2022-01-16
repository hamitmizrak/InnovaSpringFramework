package com.hamitmizrak.a6.qualifier;

import javax.enterprise.inject.Default;

// Defautta bu obje gelsin
@Default
public class Java11 implements IJavaVersion {
	
	@Override
	public String javaVersion(String data) {
		return "Default Java 11";
	}
	
}
