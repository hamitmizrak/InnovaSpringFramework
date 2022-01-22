package com.hamitmizrak.a6.qualifier;

@QualifierCokluSecim
public class Java18 implements IJavaVersion {
	
	@Override
	public String javaVersion(String data) {
		return "Opsiyonel Java 18";
	}
	
}