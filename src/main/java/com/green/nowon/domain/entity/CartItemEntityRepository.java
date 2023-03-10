package com.green.nowon.domain.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemEntityRepository extends JpaRepository<CartItemEntity, Long>{

	List<CartItemEntity> findAllByCartMemberEmail(String email);

	Optional<CartItemEntity> findByCartNoAndItemIno(long cartNo, long itemIno);

}
