package com.customobjectsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest  {

	public static void main(String[] args) {
		
		List<Person> strList  = new ArrayList<>();
		strList.add(new Person(1,"John"));
		strList.add(new Person(4,"Merry"));
		strList.add(new Person(3,"Mike"));
		strList.add(new Person(118,"Devid"));
		
		
		
		Collections.sort(strList);
		
		strList.forEach(o->System.out.println(o));
		
		System.out.println("----------------------by name----------------");
		
		Collections.sort(strList, new PersonSortByName());
		
		strList.forEach(o->System.out.println(o));

	}

}
