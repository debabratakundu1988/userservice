package com.spring_app.userservice.config;

/**
 * @author debabrata
 */
import com.azure.cosmos.*;
import com.azure.spring.data.cosmos.config.AbstractCosmosConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class CosmosDbConfig extends AbstractCosmosConfiguration {

    @Value("${azure.cosmos.uri}")
    private String uri;

    @Value("${azure.cosmos.key}")
    private String key;

    @Value("${azure.cosmos.database}")
    private String database;

    @Bean
    public CosmosClientBuilder cosmosClientBuilder() {
        return new CosmosClientBuilder()
                .endpoint(uri)
                .key(key)
                .consistencyLevel(ConsistencyLevel.SESSION)
                .gatewayMode() // Use .gatewayMode() for gateway connection
                .clientTelemetryEnabled(true)
                .throttlingRetryOptions(new ThrottlingRetryOptions()
                        .setMaxRetryAttemptsOnThrottledRequests(5)
                        .setMaxRetryWaitTime(Duration.ofSeconds(30)));
    }

    @Override
    protected String getDatabaseName() {
        return database;
    }

}
