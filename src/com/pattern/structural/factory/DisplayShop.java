package com.pattern.structural.factory;

public class DisplayShop {
	 private static DisplayShop shop;
	    private int sold;
	    private ScreenBuilder screenbuilder=new ScreenBuilder();
	   private DisplayShop(){

	    }
	    static DisplayShop createShop()
	    {
	        if(shop==null)
	            return new DisplayShop();
	        return shop;
	    }
	    public Display  sell(String name)
	    {
	        sold++;

	        return screenbuilder.makeDisplay(name);
	    }
}	
