package com.green.nowon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.nowon.domain.entity.MemberEntityRepository;
import com.green.nowon.service.SignService;

@Service
public class SignServiceProcess implements SignService{
	
	@Autowired
	private MemberEntityRepository repo;
	
}
