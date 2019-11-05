package com.rsmaxwell.utilities_test;

public class Version {


	public static void main(String[] args) {
		System.out.println("{");
     	System.out.println("   \"version\": \"" +  version() + "\",");
     	System.out.println("   \"utilities_version\": \"" +  utilities_version() + "\"");
		System.out.println("}");
	}
	
	// version function
	public static String version() {		
		return "<UTILITIES_TEST_VERSION>";
	}

	// buildDate function
	public static String buildDate() {
		return "<BUILD_DATE>";
	}

	// gitCommit function
	public static String  gitCommit() {
		return "<GIT_COMMIT>";
	}

	// gitBranch function
	public static String  gitBranch() {
		return "<GIT_BRANCH>";
	}

	// gitURL function
	public static String  gitURL() {
		return "<GIT_URL>";
	}
	
	// utilities_version function
	public static String utilities_version() {		
		return "<UTILITIES_VERSION>";
	}
}
