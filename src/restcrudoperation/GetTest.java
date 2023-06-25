package restcrudoperation;

   import static io.restassured.RestAssured.*;

public class GetTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		given().
		get("http://dummy.restapiexample.com/api/v1/employees").
		then().
		log().all();

	}

}
