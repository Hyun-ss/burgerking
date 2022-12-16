package com.green.nowon.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Setter;

@Setter
@Table(name = "burger_cart_item")
@Entity
public class CartItemEntity {
	
	@Id
	@GeneratedValue(generator = "gen_cart_item" ,strategy = GenerationType.IDENTITY)
	private long no;
	
	private int count;
	
	@JoinColumn
	@ManyToOne
	private CartEntity cart;
	
	@JoinColumn
	@ManyToOne
	private ItemEntity item;
	
	public int calcPrice() {
		return count*item.getPrice();
	}
	
}
