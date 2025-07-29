package com.spring_app.userservice.test;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;

/**
 * @author debabrata
 */
public class CosmosTest {
    public static void main(String[] args) {
        CosmosClient client = new CosmosClientBuilder()
                .endpoint("https://cosmos-bookstore-db.documents.azure.com:443/")
                .key("p8U96XpO89Dr8bouT70w6KZeA6tdjEJJz88udYxv4kD8FS5RLkkpDGx1UZploHCa0DTr2e3kKXn2ACDbSAPx6A==")
                .consistencyLevel(ConsistencyLevel.EVENTUAL)
                .buildClient();

        System.out.println("Connected to Cosmos DB");
    }
}