package com.vcs.observer.config.client.github;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@ConfigurationProperties(prefix = "client.vcs.github")
class GithubClientProperties {
    /**
     * URL of the API server
     */
    @NotBlank
    private String url;

    /**
     * Version of API to use
     */
    @NotBlank
    private String acceptVersion;

    /**
     * Number of seconds to wait for a connection
     */
    @Positive
    @NotNull
    private Integer connectTimeout;

    /**
     * Number of seconds to wait for the response
     */
    @Positive
    @NotNull
    private Integer readTimeout;

    /**
     * Flag to indicate if client should follow redirects from the server
     */
    private boolean followRedirects;
}
