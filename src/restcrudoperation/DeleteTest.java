package restcrudoperation;

import static io.restassured.RestAssured.*;

public class DeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		given().
		delete("http://dummy.restapiexample.com/api/v1/delete/{1008}").
		then().
		log().all();
	
		

	}

}
