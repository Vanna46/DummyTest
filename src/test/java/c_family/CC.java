package c_family;

import org.testng.annotations.Test;

import dataprovider_repository.RepoData;
import testBase.TestBase;


public class CC extends TestBase{
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataCCFamily")
	public void testCC(String user, String subject) throws Exception {
		log("Starting CC");
		Thread.sleep(1000);
		log("ENding CC");
		log(user + " ---------------- " + subject);
	}

}
