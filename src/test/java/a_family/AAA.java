package a_family;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataprovider_repository.RepoData;
import testBase.TestBase;

public class AAA extends TestBase{
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataAAAFamily")
	public void testAAA(String user, String subject) throws Exception {
		log("Starting AAA");
		SoftAssert.assertEquals("Title1", "Title");
		SoftAssert.assertEquals("Text1", "Text");
		Thread.sleep(1000);
		log("ENding AAA");
		log(user + " ---------------- " + subject);
		//Assert.fail("Showing Listener example");
		SoftAssert.assertAll();
	}

}
