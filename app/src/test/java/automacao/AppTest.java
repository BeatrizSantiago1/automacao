
package automacao;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testeListaMetadosUsuario() {
        when().
                get("https://reqres.in/api/users?page=2").
                then().
                statusCode(HttpStatus.SC_OK).
                body("page", is(2)).
                body("data", is(notNullValue()));
    }
    @Test
    public void testeCriarUsuarioComSucesso() {
        given().log().all().
                contentType(ContentType.JSON).
                body("{\"name\": \"rafael\", \"job\": \"eng test\"}").
        when().
                post("https://reqres.in/api/users").
        then().
                statusCode(HttpStatus.SC_CREATED).
                body("name", is("rafael"));

        }


}
