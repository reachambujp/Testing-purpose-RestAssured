package restcrudoperation;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class PutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reqbody="{\"name\":\"Manish\",\"salary\":\"7000\",\"age\":\"23\"}";
		
		
//		        given().
//				contentType(ContentType.JSON).
//				body(reqbody).
//				when().put("http://dummy.restapiexample.com/api/v1/update/1008").
//				
//				then().log().all();
		        
		
	//System.out.println(ename);
		
	String ename=	given().
		contentType(ContentType.JSON).
		body(reqbody).
		when().put("http://dummy.restapiexample.com/api/v1/update/1008").
		
		then().extract().path("data.name");
	
	System.out.println(ename);
	
	String expectedname="Manish";
	
	if((ename.compareTo(expectedname))==0) {
		System.out.println("Expected and actual name are matching");
	}
	else {
		System.out.println("Expected and actual name are matching");
	}
	
		        
			

	}

}
