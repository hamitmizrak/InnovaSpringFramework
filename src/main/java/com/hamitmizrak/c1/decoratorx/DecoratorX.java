package com.hamitmizrak.c1.decoratorx;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
abstract public class DecoratorX implements IOkul {
	
	private @Inject @Delegate IOkul iOkul;
	
	@Override
	public String asilIs(String data) {
		System.out.println("Decorator buradaydı... ");
		
		// Biz evi Ustaya teslim ettim
		String value = iOkul.asilIs(data);
		
		// eğer bu datalardan patika kelimesi geçerse
		if (data.equals("patika")) {
			value = value.replace("patika", "PATIKA INNOVA");
		}
		return value;
	}
	
}
