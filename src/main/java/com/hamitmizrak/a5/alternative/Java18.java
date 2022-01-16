package com.hamitmizrak.a5.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Java18 implements IJavaVersion {
	
	@Override
	public String javaVersion(String data) {
		return "Version Java 18";
	}
	
}
