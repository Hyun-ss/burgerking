package com.green.nowon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.nowon.domain.dto.ItemInsertDTO;
import com.green.nowon.domain.entity.ItemEntityRepository;
import com.green.nowon.service.ItemService;

@Service
public class ItemServiceProcess implements ItemService {
	
	@Autowired
	private ItemEntityRepository itemRepo;
	
	@Override
	public void save(ItemInsertDTO dto) {
		
		//나중에 카테고리 이미지 메서드 삽입 필요
		itemRepo.save(dto.toItemEntity());
	}

}
