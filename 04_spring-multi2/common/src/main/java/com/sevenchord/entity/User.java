package com.sevenchord.entity;

import com.sevenchord.entity.base.BaseEntity;

public class User extends BaseEntity {

	private String id;
	private String usernameKanji;
	private String usernameKana;
	private String mailAddress;
	private String phoneNumber;
	private String createdAt;
	private String updatedAt;
	private boolean deleted;
}
