package b_family;

import org.testng.annotations.Test;

import dataprovider_repository.RepoData;
import testBase.TestBase;


public class B extends TestBase{
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataBFamily")
	public void testB(String user, String subject) throws Exception {
		log("Starting B");
		Thread.sleep(1000);
		log("ENding B");
		log(user + " ---------------- " + subject);
	}

}
