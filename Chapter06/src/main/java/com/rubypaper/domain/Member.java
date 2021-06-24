package com.rubypaper.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Member {
	
	@Id
	private String id;
	private String password;
	private String name;
	private String role;
}
