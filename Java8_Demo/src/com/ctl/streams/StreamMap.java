package com.ctl.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		List<Integer> aList=new ArrayList<Integer>();
		aList.add(5);
		aList.add(10);
		aList.add(3);
		aList.add(12);
		aList.add(0);
		
		aList.stream().map(x -> x*x).forEach(x -> System.out.println(x));

	}

}
