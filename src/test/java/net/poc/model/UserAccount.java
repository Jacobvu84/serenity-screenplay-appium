package net.poc.model;

public class UserAccount {
	private final String loginId;
	private final String email;

	public String getLoginID() {
		return loginId;
	}

	public String getEmail() {
		return email;
	}

	public UserAccount() {
		this.loginId = "";
		this.email = "";
	}

	public UserAccount(String title, String email) {
		this.loginId = title;
		this.email = email;
	}
	
    @Override
    public String toString() {
        return "Login ID: " + getLoginID() + ", E-Mail: " + getEmail();
    } 

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		UserAccount userAccount = (UserAccount) o;

		if (loginId != null ? !loginId.equals(userAccount.loginId) : userAccount.loginId != null)
			return false;
		return email != null ? email.equals(userAccount.email) : userAccount.email == null;
	}

	@Override
	public int hashCode() {
		int result = loginId != null ? loginId.hashCode() : 0;
		result = 31 * result + (email != null ? email.hashCode() : 0);
		return result;
	}

	public static class UserAccountBuilder {
		private String loginId = "";
		private String email = "";

		public UserAccountBuilder() {
		}

		public UserAccountBuilder called(String loginId) {
			this.loginId = loginId;
			return this;
		}

		public UserAccountBuilder withEmail(String email) {
			this.email = email;
			return this;
		}

		public UserAccount build() {
			return new UserAccount(loginId, email);
		}
	}
}
