package okuken.sectest.dto;

import java.io.Serializable;

public class UserInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	public static String TYPE_ADMIN = "admin";
	public static String TYPE_MEMBER = "member";

	private String name;
	private String type;

	public UserInfo(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
