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
@Test(priority=2)
    public void api_Subject_IN()
    
       {
           Response response1 = RestAssured
                   .given()
                   .auth()
                   .basic("admin", "admin")
                   .when()
                   .get("https://apollo2.humanbrain.in/dashboard/queryOrganStatus/1");

           int statusCode1 = response1.getStatusCode();
           if (statusCode1 == 200) {
           	System.out.println("_________________________******_______________________");
               System.out.println("API request to the Dashboard OrganExtraction_SubjectsIN passed. Status code: " + statusCode1);
               System.out.println("_________________________******_______________________");
           } else {
           	System.out.println("_________________________******_______________________");
               System.out.println("API request to the Dashboard OrganExtraction_SubjectsIN failed. Status code: " + statusCode1);
           }
           Assert.assertEquals(statusCode1, 200, "API request to the Dashboard API request to the Dashboard OrganExtraction_SubjectsIN failed");
           
       }
	@Test(priority=3)
	public void api_MRI_TO_DO() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/queryOrganStatus/1");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard OrganExtraction_MRI_T0_DO Passed");
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard OrganExtraction_MRI_TO_DO failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard API request to the Dashboard OrganExtraction_MRI_TO_DO failed");
         
     }
	@Test(priority=4)
	public void api_MRI_Done() {
		 Response response1 = RestAssured
                .given()
                .auth()
                .basic("admin", "admin")
                .when()
                .get("https://apollo2.humanbrain.in/dashboard/queryOrganStatus/2");

        int statusCode2 = response1.getStatusCode();
        if (statusCode2 == 200) {
        	System.out.println("_________________________******_______________________");
            System.out.println("API request to the Dashboard OrganExtraction_MRI_DONE passed. Status code: " + statusCode2);
            System.out.println("_________________________******_______________________");
        } else {
        	System.out.println("_________________________******_______________________");
            System.out.println("API request to the Dashboard OrganExtraction_MRI_DONE  failed. Status code: " + statusCode2);
        }
        Assert.assertEquals(statusCode2, 200, "API request to the Dashboard OrganExtraction_MRI_DONE failed");
        
    }
		
	@Test(priority=5)
	public void api_Perfusion_Done() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/queryOrganStatus/3");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard OrganExtraction_Perfusion_Done passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard OrganExtraction_Perfusion_Done  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard OrganExtraction_Perfusion_Done failed");
         
     }
	@Test(priority=6)
	public void api_Rejected() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/queryOrganStatus/5");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard OrganExtraction_Rejected passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard OrganExtraction_Rejected  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard OrganExtraction_Rejected failed");
         
     }
	@Test(priority=7)
	public void api_Organ_Out() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/queryOrganStatus/4");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard OrganExtraction_Organ_Out passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard OrganExtraction_Organ_Out  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard OrganExtraction_Organ_Out failed");
         
     }
	@Test(priority=8)
	public void Subject_completed() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/queryManipulation/4");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard OrganExtraction_Subject_Completed passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard OrganExtraction_Subject_Completed   failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard OrganExtraction_Subject_Completed  failed");
         
     }
	}
