package com.example.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson04.domain.User;

@Repository
public interface UserMapper {
	
	public void insertUser(
			@Param("name") String name, 
			@Param("name") String yyyymmdd, 
			@Param("name") String email, 
			@Param("name") String introduce);
	
	public User selectLatestUser();
}
