package com.hj.gitx.v1ch13.treeSet;

public class Item implements Comparable<Item>{

	
	private String description;
	private int partNumber;
	
	public Item(String description, int partNumber) {
		super();
		this.description = description;
		this.partNumber = partNumber;
	}

	public String getDescription() {
		return description;
	}
	
	

	@Override
	public String toString() {
		return "Item [description=" + description + ", partNumber="
				+ partNumber + "]";
	}

	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + partNumber;
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
		Item other = (Item) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (partNumber != other.partNumber)
			return false;
		return true;
	}

	public void setDescription(String description) {
		this.description = description;
	}




	@Override
	public int compareTo(Item o) {

		return Integer.compare(partNumber, o.partNumber);
	}

}
