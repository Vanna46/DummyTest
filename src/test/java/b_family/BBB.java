package b_family;

import org.testng.annotations.Test;

import dataprovider_repository.RepoData;
import testBase.TestBase;


public class BBB extends TestBase{
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataBBBFamily")
	public void testBBB(String user, String subject) throws Exception {
		log("Starting BBB");
		Thread.sleep(1000);
		log("ENding BBB");
		log(user + " ---------------- " + subject);
	}

}
