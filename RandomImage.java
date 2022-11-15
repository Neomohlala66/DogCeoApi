package APiTest;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RandomImage {
    @Test
    public void GetRandomImage(){

        given()
                .get("https://dog.ceo/api/breed/hound/afghan/images/random")
                .then()
                .statusCode(200)
                .log().all();
    }

}
