package com.green.nowon.domain.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Setter;

@Setter
@Table(name = "burger_cart")
@Entity
public class CartEntity {
	
	@Id
	@GeneratedValue(generator = "gen_cart", strategy = GenerationType.IDENTITY)
	private long cno;
	
	@JoinColumn(name = "member_no")
	@OneToOne
	private MemberEntity member;
	
	
	//List<ItemEntity> items;
}
