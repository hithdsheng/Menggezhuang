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
	
	/**
	 * main method
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
