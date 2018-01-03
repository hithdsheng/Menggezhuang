package com.sheng.menggezhuang.module;

/**
 * 消息实体类
 * @author sheng
 * */
public class Message {
	
	public Message(){
		System.out.println("构造方法，Message");
	}
	
	private String id;
	private String title;
	private String category;
	private String content;
	private String time;
	private String author;
	private String auttle;
	
	//get and set methods
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuttle() {
		return auttle;
	}

	public void setAuttle(String auttle) {
		this.auttle = auttle;
	}

	/**
	 * main method
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
