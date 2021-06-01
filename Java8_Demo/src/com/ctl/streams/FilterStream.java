package com.ctl.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterStream {

	public static void main(String[] args) {
		List<Integer> aList=new ArrayList<Integer>();
		aList.add(5);
		aList.add(10);
		aList.add(3);
		aList.add(3);
		aList.add(12);
		aList.add(0);
		
		List<String> sList=new ArrayList<String>();
		sList.add("a");
		sList.add("ab");
		sList.add("abc");
		sList.add("abab");
		sList.add("achchh");
		sList = sList.stream().filter(x->x.length()%2!=0).collect(Collectors.toList());
		sList.stream().forEach(x -> System.out.println(x));
		
		Set<Integer> set=new HashSet<Integer>();
		
		//aList.stream().forEach(x -> System.out.println(x));
		
		//aList = aList.stream().filter(x -> x>= 5).collect(Collectors.toList());
		
		set = aList.parallelStream().sorted().limit(4).collect(Collectors.toSet());
		
		//aList = aList.stream().limit(3).sorted().collect(Collectors.toList());
		
		//aList = aList.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
		//aList.stream().forEach(x -> System.out.println(x));
		
		//aList.stream().filter(x -> x%2 == 0).forEach(x -> System.out.println(x));
		
		//set.stream().forEach(x -> System.out.println(x));
		
		
	}

}
