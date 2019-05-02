package PostRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PostTest {

    @Test
    public void ValidatePostTest()
    {
        Response response = RestAssured.get("https://reqres.in//api/users");

        System.out.println(response);
    }
}
