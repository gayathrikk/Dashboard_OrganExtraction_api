package com.test.Dashboard_apis;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CryoBlock_api {
	
	@Test(priority=1)
	public void CryoBlock()
	{
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/dashboardCryoBlock");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the CryoBlock failed. Status code: " + statusCode1);
        
        System.out.println("API request to the CryoBlock passed. Status code: " + statusCode1);
	}

}
