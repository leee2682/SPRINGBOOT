package com.study.springboot.jdbc;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public class IMyUserDao {
	ArrayList<MyUserDTO>getUser();
}
