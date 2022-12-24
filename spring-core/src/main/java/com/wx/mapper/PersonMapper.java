package com.wx.mapper;

import com.wx.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 王兴
 * 2022/12/24 23-38
 */
public class PersonMapper {

	public List<Person> list(){
		List<Person> personList = new ArrayList<Person>();
		Random random = new Random();
		int max = random.nextInt(10);
		for (int i = 0; i < max; i++) {
			personList.add(Person.builder().id(Integer.toString(i)).build());
		}
		return personList;
	}

}
