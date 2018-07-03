package cn.yd.oa.model;

import java.util.Date;

public class Product extends Object {
	
	public Product() {
		System.out.println("Product()..........");
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", remark=" + remark + ", date=" + date
				+ "]";
	}



	private Integer id;
	private String name;
	private Double price;
	private String remark;
	private Date date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		System.out.println("setId......");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName......");
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		System.out.println("setDate.........");
		this.date = date;
	}

}
