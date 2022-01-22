package com.pattern.structural.factory;

public class TestDesignPattern {
	public static void main(String args[])
	{
		System.out.println("hello");
		DisplayShop shop=  DisplayShop.createShop();
		Display lcd=shop.sell("lcd");
		Display led=shop.sell("led");
		lcd.run();

		led.run();

	}
}
