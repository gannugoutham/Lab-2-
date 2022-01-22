package com.pattern.structural.factory;

public class ScreenBuilder {
	public Display makeDisplay(String name)
    {
        if(name.equalsIgnoreCase("led"))
            return new LED();
        if(name.equalsIgnoreCase("lcd"))
            return new LCD();
        if(name.equalsIgnoreCase("crt"))
            return new CRT();
  return null;
    }
}
