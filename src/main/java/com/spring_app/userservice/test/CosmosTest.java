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
                .key("xxx")
                .consistencyLevel(ConsistencyLevel.EVENTUAL)
                .buildClient();

        System.out.println("Connected to Cosmos DB");
    }
}