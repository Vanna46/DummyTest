package c_family;

import org.testng.annotations.Test;

import dataprovider_repository.RepoData;
import testBase.TestBase;


public class CCC extends TestBase{
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataCCCFamily")
	public void testCCC(String user, String subject) throws Exception {
		log("Starting CCC");
		Thread.sleep(1000);
		log("ENding CCC");
		log(user + " ---------------- " + subject);
	}

}
