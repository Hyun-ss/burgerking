package com.green.nowon.domain.dto;

import com.green.nowon.domain.entity.ItemEntity;

import lombok.Data;

@Data
public class ItemInsertDTO {
	
	private String title;
	private String content;
	private int price;
	private int stock;
	
	public ItemEntity toItemEntity() {
		return ItemEntity.builder()
				.title(title)
				.content(content)
				.price(price)
				.stock(stock)
				.build();
	}
	
}
