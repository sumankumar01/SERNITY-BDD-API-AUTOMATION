package Steps;


import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetApiRequest extends UIInteractions {

    @Step("Open the Wikipedia home page")
    public void getApiCall()
    {
       // RestAssured.baseURI = "http://localhost:3000/employees";

       // RequestSpecification httpRequest = RestAssured.given();

        Response response = given().baseUri("http://localhost:3000").get("/employees").thenReturn();
        Serenity.recordReportData();
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
    }
}
