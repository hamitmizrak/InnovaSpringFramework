package com.hamitmizrak.a7.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped
public class _8_QualifierManager {
	
	// //default
	// @Inject
	// _3_IJavaVersion iJavaVersion;
	
	// opsiyonel
	@Inject
	@_2_EQalifier(_1_EJavaVersion.JAVA17)
	_3_IJavaVersion iJavaVersion;
	
	public String getiJavaVersion() {
		return iJavaVersion.javaVersion("Seçim");
	}
	
}
