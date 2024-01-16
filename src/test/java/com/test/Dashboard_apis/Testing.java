package com.test.Dashboard_apis;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Testing {
	
	@Test(priority=1)
	public void subject() {
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/dashboardSubject");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the subject failed. Status code: " + statusCode1);
        
        System.out.println("API request to the subject passed. Status code: " + statusCode1);
	}
	
	@Test(priority=2)
	public void OrganExtraction()
	{
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/dashboardOrganExtraction");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the Organ Extraction failed. Status code: " + statusCode1);
        
        System.out.println("API request to the Organ Extraction passed. Status code: " + statusCode1);
	}
	
	@Test(priority=3)
	public void Cryoprotection()
	{
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/dashboardCryoProtection");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the Cryoprotection failed. Status code: " + statusCode1);
        
        System.out.println("API request to the Cryoprotection passed. Status code: " + statusCode1);
	}
	
	@Test(priority=4)
	public void CryoBlock()
	{
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/dashboardCryoBlock");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the CryoBlock failed. Status code: " + statusCode1);
        
        System.out.println("API request to the CryoBlock passed. Status code: " + statusCode1);
	}
	
	@Test(priority=5)
	public void MRI()
	{
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/dashboardMRI");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the MRI failed. Status code: " + statusCode1);
        
        System.out.println("API request to the MRI passed. Status code: " + statusCode1);
	}
	
	@Test(priority=6)
	public void ImageQC()
	{
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/dashboardImageQC");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the ImageQC failed. Status code: " + statusCode1);
        
        System.out.println("API request to the ImageQC passed. Status code: " + statusCode1);
	}
	
	@Test(priority=7)
	public void Registration()
	{
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/ManualRegistration");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the Registration failed. Status code: " + statusCode1);
        
        System.out.println("API request to the Registration passed. Status code: " + statusCode1);
	}
	
	@Test(priority=8)
	public void AtlasCreation()
	{
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/AtlasCreation");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the AtlasCreation failed. Status code: " + statusCode1);
        
        System.out.println("API request to the AtlasCreation passed. Status code: " + statusCode1);
	}
}
