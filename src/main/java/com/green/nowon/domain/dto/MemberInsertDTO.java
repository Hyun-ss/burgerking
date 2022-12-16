package com.green.nowon.domain.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.green.nowon.domain.entity.MemberEntity;

import lombok.Setter;

@Setter
public class MemberInsertDTO {
	
	private String email;
	private String pass;
	private String name;
	
	//편의메서드
	public MemberEntity toEntity() {
		return MemberEntity.builder()
				.email(email).pass(pass).name(name)
				.build();
	}
}
