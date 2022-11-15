package APiTest;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class AllBreeds {
    @Test
    public void GetAllBreeds(){

        given()
                .get("https://dog.ceo/dog-api/")
                .then()
                .statusCode(200)
                .log().all();

    }


    public static class SubBreeds {

        @Test
        public void GetSubBreeds(){

            given()
                    .get("https://dog.ceo/api/breed/hound/list")
                    .then()
                    .statusCode(200)
                    .log().all();
        }

    }
}
