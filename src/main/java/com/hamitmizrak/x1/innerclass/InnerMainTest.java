package com.hamitmizrak.x1.innerclass;

public class InnerMainTest {
	
	public static void main(String[] args) {
		Ulke ulke = new Ulke();
		ulke.setUlkeAdi("Türkiye");
		
		Ulke.Sehir sehir = new Ulke.Sehir();
		sehir.setSehirAdi("İstanbul");
		
		Ulke.Sehir.Mahalle mahalle = new Ulke.Sehir.Mahalle();
		mahalle.setMahalleAdi("Başakşehir");
		
		System.out.println(ulke.getUlkeAdi() + " " + sehir.getSehirAdi() + " " + mahalle.getMahalleAdi());
	}
	
}
