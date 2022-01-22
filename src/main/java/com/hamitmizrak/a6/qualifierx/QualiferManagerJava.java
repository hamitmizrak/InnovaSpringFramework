package com.hamitmizrak.a6.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("qualiferCDI")
@ApplicationScoped
public class QualiferManagerJava implements Serializable {
	private static final long serialVersionUID = 3097860167944776376L;
	
	// // default icin
	// @Inject
	// private IJavaVersion iJavaVersion;
	
	// default icin
	@Inject
	@QualifierCokluSecim
	private IJavaVersion iJavaVersion;
	
	public String getiJavaVersion() {
		return iJavaVersion.javaVersion(" Sürüm ");
	}
	
}
