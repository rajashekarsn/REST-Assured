package getRequest;

import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class GetData {
	
	@Test
	public void testresponsecode()
	{
		int code = get("https://restcountries.eu/rest/v2/name/nepal").getStatusCode();
		System.out.println("Status code is " + code);
		assertEquals(code, 200);
	}

	@Test
	public void testbody()
	{
		String body = get("https://restcountries.eu/rest/v2/name/nepal").asString();
		System.out.println("Body is " + body);
		
	}

}
