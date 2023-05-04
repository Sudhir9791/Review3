package com.example.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long prodid;
	private String prodname;

	private String street;
    private String city;
    private String zipcode;
    public Long getProdid() {
    	return prodid;
    }
    public void setProdid(Long prodid) {
    	this.prodid = prodid;
    }
    public String getProdname() {
    	return prodname;
    }
    public void setProdname(String prodname) {
    	this.prodname = prodname;
    }
	
    private String price;
    public String getPrice() {
    	return price;
    }
    public void setPrice(String price) {
    	this.price = price;
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
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + prodid + ", street=" + street + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
    
}

