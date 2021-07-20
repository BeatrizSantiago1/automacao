
package automacao;

import org.junit.Test;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testeVideoAula() {
        when().
                get("https://reqres.in/api/users?page=2").
        then().
                statusCode(200);



    }
}
