package com.rsmaxwell.utilities.test;

import com.rsmaxwell.utilities.basic.Timestamp;
import com.rsmaxwell.utilities.version.Version;

public class Test {

	public static void main(String[] args) {
		String buildID = Version.buildID(); 
		String now = Timestamp.now();
		System.out.println("BuildId: " + buildID);
		System.out.println("Now: " + now);
	}

}
