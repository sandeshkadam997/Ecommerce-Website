package com.geektser.weeklytest.project.EcommerceAPIApplication.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;


@Entity
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    
    @Column(name = "user_name")
    private String userName;
    
    @Column(name = "user_email")
    private String userEmail;
    
    @Column(name = "user_password")
    private String userPassword;
    
    @Column(name = "user_phone_no")
    private String userPhoneNo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_Address_Id")
    private Address address;

	public void setAddress(Address address) {
		this.address=address;
	}
	public void setAddresses(Address address) {
		this.address=address;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		System.out.println("Getting password ");
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		System.out.println("Setting Password");
		this.userPassword = userPassword;
	}

	public String getUserPhoneNo() {
		return userPhoneNo;
	}

	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}

	public Address getAddress() {
		return address;
	}
	
	public User(Integer userId, String userName, String userEmail, String userPassword, String userPhoneNo,
			Address address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userPhoneNo = userPhoneNo;
		this.address = address;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", userPhoneNo=" + userPhoneNo + ", address=" + address + "]";
	}
}


