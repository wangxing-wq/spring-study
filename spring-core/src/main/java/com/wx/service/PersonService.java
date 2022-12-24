package com.wx.service;

import com.wx.domain.Person;
import com.wx.mapper.PersonMapper;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王兴
 * 2022/12/24 23-38
 */
@Getter@Setter
public class PersonService {

	private PersonMapper personMapper;
	
	
	public List<Person> list(){
		return personMapper.list();
	}
	


}
