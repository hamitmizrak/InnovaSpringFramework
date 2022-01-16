package com.hamitmizrak.a3.cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

// pojo<Bean<managementBean<CdiBEan
@Named
@ApplicationScoped
public class Computer implements Serializable {
	private static final long serialVersionUID = -1806256027076814974L;
	private String computerName;
	
	// parametresiz constructor
	public Computer() {
		this.computerName = "Bilgisayar Adı 544515MXCCCR";
	}
	
	// parametreli constructor
	public Computer(String computerName) {
		this.computerName = computerName;
	}
	
	@Override
	public String toString() {
		return "Computer [computerName=" + computerName + "]";
	}
	
	public String getComputerName() {
		return computerName;
	}
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
}
