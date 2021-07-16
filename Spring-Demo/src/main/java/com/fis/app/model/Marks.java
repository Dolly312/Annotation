package com.fis.app.model;

public class Marks {
       private int sub1;
       private int sub2;
       private int sub3;
       
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	
	
	
	@Override
	public String toString() {
		return "Marks [sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + sub1;
		result = prime * result + sub2;
		result = prime * result + sub3;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marks other = (Marks) obj;
		
		if (sub1 != other.sub1)
			return false;
		if (sub2 != other.sub2)
			return false;
		if (sub3 != other.sub3)
			return false;
		return true;
	}
	public Marks(int sub1, int sub2, int sub3) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		
	}
	public Marks() {
		super();
	}
	
}
