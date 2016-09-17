package com.kxind.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kxind.domain.Users;
import com.kxind.mapper.UsersMapper;

public class Test {
  public static void main(String[] args) {
   ApplicationContext applicationContex=new ClassPathXmlApplicationContext("/applicationContext.xml");
   UsersMapper usersMapper=(UsersMapper) applicationContex.getBean("UsersMapper");
  usersMapper.save(new Users("123", "123", "123"));
  }
}
