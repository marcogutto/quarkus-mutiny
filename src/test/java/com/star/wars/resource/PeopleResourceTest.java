package com.star.wars.resource;

import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.Uni;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PeopleResourceTest {

    // @Test
    // public void testHelloEndpoint() {
    //     given()
    //       .when().get("/hello")
    //       .then()
    //          .statusCode(200)
    //          .body(is("Hello RESTEasy"));
    // }


    // @Test
    // public void testMutiny() {
      
    //     Uni<String> test = Uni.createFrom().item("item");

    //     test.subscribe().with(
    //         result -> result("result"),
    //         failure -> result("failure")
    //     );
    // }

    // public void result(String result){
    //     System.out.println(result);
    // }
}