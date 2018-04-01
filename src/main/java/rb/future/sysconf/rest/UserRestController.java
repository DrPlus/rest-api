package rb.future.sysconf.rest;

import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rb.future.sysconf.model.User;
import rb.future.sysconf.model.UserRight;

@RestController
public class UserRestController {

	@RequestMapping("/api/login")
	public User user() {
		Set<UserRight> rights = new HashSet<>();
		rights.add(UserRight.CONFIGURATION_PARAMETER);
		rights.add(UserRight.CREATE_SYSTEM_ALERT);
		return new User(Long.valueOf(111), "Ivanov@raiffeisen.ru", "SuperIval", rights);
	}
}
