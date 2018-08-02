package com.lgd.hadoop.fdc.domain;

import java.util.Date;

public class FdcTest
{
	private Integer myKey;
	private String myColumn;

	public FdcTest() {
		
	}
	
	public FdcTest(Integer myKey) {
		this.myKey = myKey;
	}
	
	public FdcTest(Integer myKey, String myColumn) {
		this.myKey = myKey;
		this.myColumn = myColumn;
	}

	@Override
	public String toString() {
		return "FdcTest [FdcTest=" + myKey + ", name=" + myColumn + " ]";
	}
	
	public Integer getMyKey() {
		return myKey;
	}
	public void setMyKey(Integer myKey) {
		this.myKey = myKey;
	}
	public String getMyColumn() {
		return myColumn;
	}
	public void setMyColumn(String myColumn) {
		this.myColumn = myColumn;
	}
}
