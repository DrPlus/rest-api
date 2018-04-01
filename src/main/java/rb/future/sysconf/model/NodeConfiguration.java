package rb.future.sysconf.model;

public class NodeConfiguration {
	private final Long id;
	private final String title;
	private final Address fullAddress;

	public NodeConfiguration(Long id, String title, Address fullAddress) {
		this.id = id;
		this.title = title;
		this.fullAddress = fullAddress;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAddress() {
		return fullAddress.getAddress();
	}

}
