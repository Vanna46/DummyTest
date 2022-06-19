package a_family;

import org.testng.annotations.Test;

import dataprovider_repository.RepoData;
import testBase.TestBase;

public class AA extends TestBase {
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataAAFamily")
	public void testAA(String user, String subject) throws Exception {
		log("Starting AA");
		Thread.sleep(1000);
		log("ENding AA");
		log(user + " ---------------- " + subject);
	}

}
