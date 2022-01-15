package com.hamitmizrak.a1.iocli.cdisiz;

public class MainTest {
	
	public static void main(String[] args) {
		_02_JavaManager javaManager = new _02_JavaManager(new _02_Java20());
		javaManager.newJavaVersion();
		
	}
	// S.O.L.I.D
	// SingleReponsibility: tek sorumluluk ==>örnek: _02_Java20
	// Open Closed : var olan özelliği korumalı yeni özelliği açık olmalı
	
	// Software Prensible
	// KISS: Keep it Simple Stupid: olabildiğince herşeyi kısadan çöz
	
}
