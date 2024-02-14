package com.geektser.weeklytest.project.EcommerceAPIApplication.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Product {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "product_id")
	    private Integer productId;
	    
	    @Column(name = "product_name")
	    private String productName;
	    
	    @Column(name = "product_price")
	    private Integer productPrice;
	    
	    @Column(name = "product_desc")
	    private String productDesc;
	    
	    @Enumerated(EnumType.STRING)
	    @Column(name = "product_category")
	    private ProductCategory productCategory;
	    
	    @Column(name = "product_brand")
	    private String productBrand;
	    
    public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public ProductCategory getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	
	public Product(Integer productId, String productName, Integer productPrice, String productDesc,
			ProductCategory productCategory, String productBrand) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDesc = productDesc;
		this.productCategory = productCategory;
		this.productBrand = productBrand;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDesc=" + productDesc + ", productCategory=" + productCategory + ", productBrand="
				+ productBrand + "]";
	}
	
	
	
	
}