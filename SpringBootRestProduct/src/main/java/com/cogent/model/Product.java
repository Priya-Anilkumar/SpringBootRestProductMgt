package com.cogent.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ProductDetails")
public class Product {
	@Id
	private int productCode;
	private String productName;
	private double price;
	private int quantity;
	
}
