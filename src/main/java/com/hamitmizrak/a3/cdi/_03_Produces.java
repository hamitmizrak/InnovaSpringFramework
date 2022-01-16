package com.hamitmizrak.a3.cdi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

// loose coupling = Gevşek bağlama ==> @Inject ve @Produces
@Named(value = "uretenCDI")
@ApplicationScoped
public class _03_Produces implements Serializable {
	private static final long serialVersionUID = -4711998929799872984L;
	
	// üreten
	@Produces
	public List<String> ureteLists() {
		List<String> listem = new ArrayList<String>();
		listem.add("Malatya");
		listem.add("Nevşehir");
		listem.add("Kütahya");
		return listem;
	}
	
}