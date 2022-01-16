package com.hamitmizrak.a3.cdi;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "tuketenCDI")
@ApplicationScoped
public class _02_Inject implements Serializable {
	private static final long serialVersionUID = 2473128616048240225L;
	
	// tuketen
	@Inject
	private List<String> tuketenList;
	
	public List<String> getTuketenList() {
		return tuketenList;
	}
	
}
