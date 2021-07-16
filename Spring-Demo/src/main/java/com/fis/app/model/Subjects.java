package com.fis.app.model;

public class Subjects {
      private String subName;
      private String subCode;
      private int subMarks;
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public int getSubMarks() {
		return subMarks;
	}
	public void setSubMarks(int subMarks) {
		this.subMarks = subMarks;
	}
	
	public Subjects() {
		super();
	}
	public Subjects(String subName, String subCode, int subMarks) {
		super();
		this.subName = subName;
		this.subCode = subCode;
		this.subMarks = subMarks;
	}
	@Override
	public String toString() {
		return "Subjects [subName=" + subName + ", subCode=" + subCode + ", subMarks=" + subMarks + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subCode == null) ? 0 : subCode.hashCode());
		result = prime * result + subMarks;
		result = prime * result + ((subName == null) ? 0 : subName.hashCode());
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
		Subjects other = (Subjects) obj;
		if (subCode == null) {
			if (other.subCode != null)
				return false;
		} else if (!subCode.equals(other.subCode))
			return false;
		if (subMarks != other.subMarks)
			return false;
		if (subName == null) {
			if (other.subName != null)
				return false;
		} else if (!subName.equals(other.subName))
			return false;
		return true;
	}
	
	
}
