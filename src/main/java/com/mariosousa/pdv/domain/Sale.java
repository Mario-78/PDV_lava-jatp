package com.mariosousa.pdv.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Sale implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date date;
	
	@JsonBackReference
	@ManyToMany
	@JoinTable(name = "SALE_CLEARSERVISE",
		joinColumns = @JoinColumn(name = "sale_id"),
		inverseJoinColumns = @JoinColumn(name = "clearServise_id")
	)
	private List<ClearService> services = new ArrayList<>();
	
	@JsonBackReference
	@ManyToMany
	@JoinTable(name = "SALE_PRODUCT",
		joinColumns = @JoinColumn(name= "sale_id"),
		inverseJoinColumns = @JoinColumn(name = "product_id")
	)
	private List<Product> products = new ArrayList<>();
	
	public Sale() {

	}

	public Sale(Integer id, Date date) {
		this.id = id;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public List<ClearService> getServices() {
		return services;
	}

	public void setServices(List<ClearService> services) {
		this.services = services;
	}
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sale other = (Sale) obj;
		return Objects.equals(id, other.id);
	}
			
}
