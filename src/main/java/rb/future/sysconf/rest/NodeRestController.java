package rb.future.sysconf.rest;

import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rb.future.sysconf.model.Address;
import rb.future.sysconf.model.Node;
import rb.future.sysconf.model.NodeConfiguration;
import rb.future.sysconf.model.NodeRight;

@RestController
@RequestMapping("api/node")
public class NodeRestController {

	@RequestMapping("get")
	public Node node() {
		Set<NodeRight> rights = new HashSet<>();
		rights.add(NodeRight.CONFIGURATION_PARAMETER);
		rights.add(NodeRight.CREATE_SYSTEM_ALERT);
		return new Node(Long.valueOf(123123), "Main node", rights);

	}

	@RequestMapping(consumes = "application/json", path = "init", method = RequestMethod.POST)
	public NodeConfiguration nodeConfig(@RequestBody Address address) {
		System.out.println(address);
		return new NodeConfiguration(Long.valueOf(123), "New configuration", address);
	}

}
