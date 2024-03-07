package com.kce.bean;

public class Library {
  private int BOOK_ID;
	private String TITLE;
	private String AUTHOR;
	private String  NAME;
	public Library(int BOOK_ID, String TITLE, String AUTHOR, String NAME) {
	super();
	this.BOOK_ID = BOOK_ID;
	this.TITLE= TITLE;
	this.AUTHOR = AUTHOR;
	this.NAME = NAME;
	}
	public int getBOOK_ID() {
	return BOOK_ID;
	}
	public void setBOOK_ID(int BOOK_ID) {
	this.BOOK_ID = BOOK_ID;
	}
	public String getTITLE() {

	return TITLE;
	}
	public void setTITLE(String TITLE) {
	this.TITLE = TITLE;
	}
	public String getAUTHOR() {
	return AUTHOR;
	}
	public void setAUTHOR(String AUTHOR) {
	this.AUTHOR = AUTHOR;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME() {
		this.NAME = NAME;
	}
	@Override
	public String toString() {
	return "Library [BOOK_ID="+ BOOK_ID + ",TITLE="+TITLE+",AUTHOR="+AUTHOR+",NAME="+NAME+"]";

}
}


