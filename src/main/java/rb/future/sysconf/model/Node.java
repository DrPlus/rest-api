package rb.future.sysconf.model;

import java.util.Set;

public class Node {
	private final Long id;
	private final String title;
	private final Set<NodeRight> rights;

	public Node(Long id, String title, Set<NodeRight> rights) {
		super();
		this.id = id;
		this.title = title;
		this.rights = rights;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Set<NodeRight> getRights() {
		return rights;
	}

}
