package com.rsmaxwell.utilities_test;

import com.rsmaxwell.utilities.basic.Timestamp;

public class Test {

	public static void main(String[] args) {
		String buildID = Version.buildID(); 
		String now = Timestamp.now();
		System.out.println("BuildId: " + buildID);
		System.out.println("Now: " + now);
	}

}
