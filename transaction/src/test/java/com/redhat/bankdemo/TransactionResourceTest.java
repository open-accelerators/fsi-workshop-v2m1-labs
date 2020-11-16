package com.redhat.bankdemo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
public class TransactionResourceTest {

    @Test
    public void testTransactionEndpoint() {

        // List transactions for a target 5005 account
       
        // Check return contains "accountId":"5005"
    }

}