package com.green.nowon.domain.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@SequenceGenerator(name = "gen_mem", sequenceName = "seq_mem", initialValue = 1, allocationSize = 1)
@Table(name = "burger_member")
@Entity
public class MemberEntity extends BaseDateEntity{
	
	@Id
	@GeneratedValue(generator = "gen_mem", strategy = GenerationType.SEQUENCE)
	private long mno;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String pass;
	
	@Column(nullable = false)
	private String name;
	
	private String nickName; //사용여부 검토중
	
	private String birth; //사용여부 검토중
	
	@Column(nullable = false) 
	private String tel; //사용여부 검토중
}
