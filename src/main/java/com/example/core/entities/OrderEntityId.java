package com.example.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class OrderEntityId implements Serializable{
	private static final long serialVersionUId = 1L;
	private Integer order_id;
	@Column(name="item_id")
	private Integer id;
	
	public OrderEntityId() {
		
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUId;
	}
	public OrderEntityId(Integer order_id, Integer item_id) {
		this.order_id = order_id;
		this.id = item_id;
	}
	@Override
	public boolean equals(Object obj) {
		OrderEntityId id= (OrderEntityId)obj;
		if (this == obj)
			return true;
		else if(obj == null || obj.getClass()!= this.getClass())
            return false;
		else if(this.getOrder_id().equals(id.getOrder_id()) && this.getId().equals(id.getId()))
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
		return this.getOrder_id()+this.getId();
	}
}
