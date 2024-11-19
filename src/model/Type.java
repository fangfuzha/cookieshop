package model;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Type {
	private int id;
	private String name;
	
	private String encodeName;
	
	public String getEncodeName() {
		return encodeName;
	}
	public void setEncodeName(String encodeName) {
		this.encodeName = encodeName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
        this.encodeName = URLEncoder.encode(name, StandardCharsets.UTF_8);
    }
	public Type(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Type() {
		super();
	}
	public Type(String name) {
		super();
		this.name = name;
	}
	
}
