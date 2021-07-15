package com.example.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
//@IdClass(OrderEntityId.class)
@Table(name="order_details")
public class OrderEntity{
	
	/*
	 * @Id //@GeneratedValue(strategy = GenerationType.IDENTITY) private Integer
	 * order_id;
	 * 
	 * @Id
	 * 
	 * @Column(name="item_id") private Integer id;
	 */
	@EmbeddedId
	private OrderEntityId oId;
	private String user_name;
	private String street;
	private String city;
	private String postalCode;
	private String name;
	@Column(name="quantity")
	private Integer amount;
	private Double price;
	@Column(name="total_amount")
	private Double totalAmount;

	/*
	 * public Integer getOrder_id() { return order_id; } public void
	 * setOrder_id(Integer order_id) { this.order_id = order_id; } public Integer
	 * getId() { return id; } public void setId(Integer id) { this.id = id; }
	 */
	public String getUser_name() {
		return user_name;
	}
	public OrderEntityId getoId() {
		return oId;
	}
	public void setoId(OrderEntityId oId) {
		this.oId = oId;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
