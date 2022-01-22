package com.hamitmizrak.c1.decoratorx;

public class Mudur implements IOkul {
	
	@Override
	public String asilIs(String data) {
		return "asıl iş:  " + data;
	}
	
	@Override
	public String yedekIs(String data) {
		return "yedek iş : " + data;
	}
	
}
