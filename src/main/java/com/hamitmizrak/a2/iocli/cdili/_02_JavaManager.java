package com.hamitmizrak.a2.iocli.cdili;

import javax.inject.Inject;

// alt+s
// Manuel IOC kullandım
// C.D.I
public class _02_JavaManager {
	
	// interface çağır
	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	private _01_JavaVersion javaInterface;
	
	// paramatreli constructor
	public _02_JavaManager(_01_JavaVersion javaInterface) {
		this.javaInterface = javaInterface;
	}
	
	// Metot
	public void newJavaVersion() {
		javaInterface.javaVersion();
	}
	
}
