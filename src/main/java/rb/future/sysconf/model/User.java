package rb.future.sysconf.model;

import java.util.Set;

public class User {

	private final Long id;
	private final String email;
	private final String login;
	private final Set<UserRight> rights;

	public User(Long id, String email, String login, Set<UserRight> rights) {
		super();
		this.id = id;
		this.email = email;
		this.login = login;
		this.rights = rights;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getLogin() {
		return login;
	}

	public Set<UserRight> getRights() {
		return rights;
	}

}
