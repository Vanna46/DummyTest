package c_family;

import org.testng.annotations.Test;

import dataprovider_repository.RepoData;
import testBase.TestBase;


public class C extends TestBase{
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataCFamily")
	public void testC(String user, String subject) throws Exception {
		log("Starting C");
		Thread.sleep(1000);
		log("ENding C");
		log(user + " ---------------- " + subject);
	}

}
