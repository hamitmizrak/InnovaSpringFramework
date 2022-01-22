package com.hamitmizrak.c1.decoratorx;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "okulCdi")
@ApplicationScoped
public class OkulBean implements Serializable {
	private static final long serialVersionUID = 1321783485104670185L;
	
	@Inject
	IOkul iOkul;
	
	public String getYedekIs() {
		return iOkul.yedekIs("patika44");
	}
	
	public String getAsilIs() {
		return iOkul.asilIs("patika44");
	}
	
}
