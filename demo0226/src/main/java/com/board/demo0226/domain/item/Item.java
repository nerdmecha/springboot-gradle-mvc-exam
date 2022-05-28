package com.board.demo0226.domain.item;

import lombok.Data;

@Data
public class Item {
	private Long id;
	private String itemname;
	private Integer price;
	private Integer quantity;
	
	public Item() {
		
	}
	
	public Item(String itemname, Integer price, Integer quantity) {
		this.itemname = itemname;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getItemName() {
		return itemname;
	}
	
	public void setItemName(String itemname) {
		this.itemname = itemname;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Integer getQuantity() {
		return quantity ;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}