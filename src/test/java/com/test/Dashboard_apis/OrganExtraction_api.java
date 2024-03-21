package com.test.Dashboard_apis;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OrganExtraction_api {
	
	@Test(priority=1)
	public void OrganExtraction()
	{
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/dashboardOrganExtraction");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the Organ Extraction failed. Status code: " + statusCode1);
        
        System.out.println("API request to the Organ Extraction passed. Status code: " + statusCode1);
	}

}
