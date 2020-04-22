package com.tnqls.spring.domain;

import java.sql.Date;

public class Post {
	private int id;
	private String author;
	private String title;
	private String content;
	private Date generated_date;
	private Date revised_date;
	private int view_cnt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getGenerated_date() {
		return generated_date;
	}
	public void setGenerated_date(Date generated_date) {
		this.generated_date = generated_date;
	}
	public Date getRevised_date() {
		return revised_date;
	}
	public void setRevised_date(Date revised_date) {
		this.revised_date = revised_date;
	}
	public int getView_cnt() {
		return view_cnt;
	}
	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}
	
	
}
