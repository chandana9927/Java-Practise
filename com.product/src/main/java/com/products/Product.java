package com.products;

public class Product {
private String name;
private int price;
private String description;
private String brand;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Product(String name, int price, String description, String brand) {
	super();
	this.name = name;
	this.price = price;
	this.description = description;
	this.brand = brand;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "products [name=" + name + ", price=" + price + ", description=" + description + ", brand=" + brand + "]";
}

}
