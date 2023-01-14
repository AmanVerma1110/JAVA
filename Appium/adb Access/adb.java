package com.basicfunction.pageobjects;

import org.testng.annotations.Test;

public class Adb extends Servermanager {
	
	public static String command(String command) {
		if(command.startsWith("adb")) command = command.replace("adb",Servermanager.getAndroidHome()+"/platform-tools/adb ");
		else throw new RuntimeException("This method is designed to run ADB command only!");
		String output = Servermanager.runCommand(command);
		if(output==null) return "";
		else return output;
	}
	
//	@Test
//	public void testadb() {
//		System.out.println(command("adb devices"));
//		System.out.println(command("adb shell input keyevent 24"));
//		System.out.println(command("adb shell input keyevent 24"));
//		System.out.println(command("adb shell input keyevent 25"));
//		System.out.println(command("adb shell input keyevent 25"));
//	}
}
