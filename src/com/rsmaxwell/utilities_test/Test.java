package com.rsmaxwell.utilities_test;

import com.rsmaxwell.utilities.basic.Timestamp;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Version: " +  Version.version());
		System.out.println("Now: " + Timestamp.now());
		System.out.println("utilities_version: " + Version.utilities_version());

		System.out.println("utilities.Version: " + com.rsmaxwell.utilities.Version.version());
	}
}
