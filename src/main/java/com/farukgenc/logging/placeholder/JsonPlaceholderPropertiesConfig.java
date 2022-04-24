package com.farukgenc.logging.placeholder;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created on April, 2022
 *
 * @author Faruk
 */

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "json-placeholder-api")
public class JsonPlaceholderPropertiesConfig {

	private String baseUri;

	private int readTimeout;

	private int connectTimeout;

}
