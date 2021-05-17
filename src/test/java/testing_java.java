import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class testing_java {

	@Test
    public void atest_post() {
        JSONObject create = new JSONObject();

        create.put("name", "Ayrol");
        create.put("job", "Lawyer");

        System.out.println(create.toJSONString());

        given().
                body(create.toJSONString()).
        when().
                post ("https://reqres.in/api/users%22").
        then().
            statusCode(201);
    }
	@Test
    public void btest_patch() {
        JSONObject create = new JSONObject();

        create.put("name", "Jose");
        create.put("job", "Chef");

        System.out.println(create.toJSONString());

        given().
                body(create.toJSONString()).
        when().
                patch ("https://reqres.in/api/users/2").
        then().
            statusCode(200);
	}
	@Test
    public void ctest_get() {
        
        when().
                get ("https://reqres.in/api/users/2").
        then().
            statusCode(200);
	}
	@Test
    public void dtest_del() {
        
        when().
                delete ("https://reqres.in/api/users/2").
        then().
            statusCode(204).log().all();
        
	}

}
