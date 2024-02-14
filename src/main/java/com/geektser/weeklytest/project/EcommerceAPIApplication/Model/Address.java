package com.geektser.weeklytest.project.EcommerceAPIApplication.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer addressId;

    @Column(name = "address_name")
    private String addressName;

    @Column(name = "address_landmark")
    private String addressLandMark;

    @Column(name = "address_state")
    private String addressState;

    @Column(name = "address_phone_number")
    private String addressPhoneNumber;

    @Column(name = "address_zip_code")
    private String addressZipCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    private User user;

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getAddressLandMark() {
		return addressLandMark;
	}

	public void setAddressLandMark(String addressLandMark) {
		this.addressLandMark = addressLandMark;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public String getAddressPhoneNumber() {
		return addressPhoneNumber;
	}

	public void setAddressPhoneNumber(String addressPhoneNumber) {
		this.addressPhoneNumber = addressPhoneNumber;
	}

	public String getAddressZipCode() {
		return addressZipCode;
	}

	public void setAddressZipCode(String addressZipCode) {
		this.addressZipCode = addressZipCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	 
	public Address(Integer addressId, String addressName, String addressLandMark, String addressState,
				String addressPhoneNumber, String addressZipCode, User user) {
			super();
			this.addressId = addressId;
			this.addressName = addressName;
			this.addressLandMark = addressLandMark;
			this.addressState = addressState;
			this.addressPhoneNumber = addressPhoneNumber;
			this.addressZipCode = addressZipCode;
			this.user = user;
		}
		public Address() {
			super();
		}
		
		  @Override
			public String toString() {
				return "Address [addressId=" + addressId + ", addressName=" + addressName + ", addressLandMark="
						+ addressLandMark + ", addressState=" + addressState + ", addressPhoneNumber=" + addressPhoneNumber
						+ ", addressZipCode=" + addressZipCode + ", user=" + user + "]";
			}


}
