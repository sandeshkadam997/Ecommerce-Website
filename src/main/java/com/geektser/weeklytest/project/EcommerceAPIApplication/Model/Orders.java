package com.geektser.weeklytest.project.EcommerceAPIApplication.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
public class Orders {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    
    @Column(name = "product_quantity")
    private Integer productQuantity;
    
    @OneToOne()
    @JoinColumn(name = "fk_address_id")
    private Address address;
   
    @ManyToOne()
    @JoinColumn(name = "fk_user_id")
    private User user;

    @ManyToMany()
    @JoinTable(name = "fk_order_product_table",joinColumns = @JoinColumn(name = "fk_order_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_product_id"))
    private List<Product> products;
    
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Integer getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	public Orders(Integer orderId, User user, List<Product> products, Address address, Integer productQuantity) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.products = products;
		this.address = address;
		this.productQuantity = productQuantity;
	}
	public Orders() {
		super();
	}
	
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", user=" + user + ", products=" + products + ", address=" + address
				+ ", productQuantity=" + productQuantity + "]";
	}


}



