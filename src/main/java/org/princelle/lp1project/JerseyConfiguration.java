package org.princelle.lp1project;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.princelle.lp1project.Routes.UserResource;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/app")
public class JerseyConfiguration extends ResourceConfig {
	public JerseyConfiguration() {
		register(UserResource.class);
	}
}