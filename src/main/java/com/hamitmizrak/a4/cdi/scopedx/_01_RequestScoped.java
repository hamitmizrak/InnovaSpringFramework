package com.hamitmizrak.a4.cdi.scopedx;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

// pojo<Bean<managementBean<CdiBEan
@Named(value = "requestCDI")
@RequestScoped // tek bir istek yaşar sonrasında ölür //performansı olumsuz
// yönde etkiler

public class _01_RequestScoped implements Serializable {
	private static final long serialVersionUID = -1806256027076814974L;
	
	public String scoped() {
		return "Request Scope: " + hashCode();
	}
}
