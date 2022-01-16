package com.hamitmizrak.b1.interceptor;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("interceptorAOP")
@ApplicationScoped
public class _4_AopBean implements Serializable {
	private static final long serialVersionUID = 1548548484848998489L;
	
	@Inject
	private _3_Login login;
	
	public String getLogin() {
		return login.isLogin("Admin sayfası admin.xhtml");
	}
	
}
