package com.example.demo;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop {

	private int lid;
	private String cubical;
	private String ram;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getCubical() {
		return cubical;
	}
	public void setCubical(String cubical) {
		this.cubical = cubical;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", cubical=" + cubical + ", ram=" + ram + "]";
	}
	public void compile() {
		System.out.println("Complie");
	}
	
}
