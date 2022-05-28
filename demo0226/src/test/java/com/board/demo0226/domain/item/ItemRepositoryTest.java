package com.board.demo0226.domain.item;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemRepositoryTest {
	ItemRepository itemRepository = new ItemRepository();
	
	@AfterEach
	void afterEach() {
		itemRepository.clearStore();
	}
	
	@Test
	void save() {
		// GIVEN
		Item item = new Item("itemA", 10000, 10);
		// WHEN
		Item savedItem = itemRepository.save(item);
		// THEN
		Item findItem = itemRepository.findById(item.getId());
		assertThat(findItem).isEqualTo(savedItem);
	}
	
	@Test
	void findAll() {
		// GIVEN
		Item item01 = new Item("item01", 10000, 10);
		Item item02 = new Item("item02", 20000, 20);
		// WHEN
		List<Item> result = itemRepository.findAll();
		// THEN
		assertThat(result.size()).isEqualTo(2);
		assertThat(result).contains(item01, item02);
	}
	
	@Test
	void updateItem() {
		// GIVEN
		Item item = new Item("item01", 10000, 10);
		Item savedItem = itemRepository.save(item);
		Long itemId = savedItem.getId();
		// WHEN
		Item updateParam = new Item("item02", 20000, 30);
		itemRepository.update(itemId, updateParam);
		Item findItem = itemRepository.findById(itemId);
		// THEN
		assertThat(findItem.getItemName()).isEqualTo(updateParam.getItemName());
		assertThat(findItem.getPrice()).isEqualTo(updateParam.getPrice());
		assertThat(findItem.getQuantity()).isEqualTo(updateParam.getQuantity());
	}
}