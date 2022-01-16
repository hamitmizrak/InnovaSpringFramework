package com.hamitmizrak.a5.alternative;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

// pojo<Bean<managementBean<CdiBEan
@Named(value = "applicationCDI")
@ApplicationScoped // Server ayakta kaldığı süre zarfında yaşar farklı browser yaşar aynı browserda
					// yaşar

public class _03_ApplicationScoped implements Serializable {
	private static final long serialVersionUID = -1806256027076814974L;
	
	public String scoped() {
		return "Application Scope: " + hashCode();
	}
	
}
