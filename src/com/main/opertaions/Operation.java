package com.main.opertaions;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Operation {

	public static void addFile(Scanner sc, StringBuilder path) {
		System.out.println("Please enter the file name ");
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		String myFile = path.append(sb).toString();
		File f = new File(myFile);
		try {
			if (f.createNewFile()) {
				System.out.println("File added ");
			} else {
				System.out.println("File Already Exists ");

			}
		} catch (Exception e) {
			System.out.println("Issues in adding file");

		}
	}

	public static void deleteFile(Scanner sc, StringBuilder path) {
		
		System.out.println("Please enter the file name ");
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		String myFile = path.append(sb).toString();

		File f = new File(myFile);
		if (f.exists()) {
			if (f.delete()) {
				System.out.println("your file has been deleted");
			} else {
				System.out.println("could not delete the file ");
			}
		} else {
			System.out.println("File Not Found");
		}
	}

	public static void searchFile(Scanner sc, StringBuilder path) {
		System.out.println("Please enter the file name ");
		String str = sc.next();
		// StringBuilder sb = new StringBuilder(str);
		// String myFile = path.append(sb).toString();

		File f = new File(path.toString());
		List<String> l = new ArrayList(Arrays.asList(f.list()));
		if (l.contains(str)) {
			System.out.println("File found on the path");
		} else {
			System.out.println("File does not exist on the path");

		}
	}

	public static void listFiles(StringBuilder path) {

		File f = new File(path.toString());
		Set<String> mySet = new TreeSet(Arrays.asList(f.list()));
		Iterator<String> it = mySet.iterator();
		if (mySet.size() == 0) {
			System.out.println("No files on this path");
		} else {
			System.out.println("List of files available on path " + path + "are :");
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}

}
