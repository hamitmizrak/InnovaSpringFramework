package com.hamitmizrak.a7.enumqualifierx;

import javax.enterprise.inject.Default;

@Default
public class _4_DefaultJavaVersion implements _3_IJavaVersion {
	
	@Override
	public String javaVersion(String data) {
		return "Default java version 11";
	}
	
}
