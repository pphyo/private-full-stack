package tech.codoverse.entity;

import tech.codoverse.orm.Column;
import tech.codoverse.orm.Table;

@Table(name = "accounts")
public class Account {

	@Column
	private long id;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false)
	private String password;

	@Column(name = "registered_days")
	private int registeredDays;

	@Column
	private boolean deleted;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRegisteredDays() {
		return registeredDays;
	}

	public void setRegisteredDays(int registeredDays) {
		this.registeredDays = registeredDays;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}
