package cl.tuvision.configuracion;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix="mi-prefijo")
public class spring {
	private String uri;
	
	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	

}
