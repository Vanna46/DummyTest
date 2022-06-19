package b_family;

import org.testng.annotations.Test;

import dataprovider_repository.RepoData;
import testBase.TestBase;

public class BB extends TestBase{
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataBBFamily")
	public void testBB(String user, String subject) throws Exception {
		log("Starting BB");
		Thread.sleep(1000);
		log("ENding BB");
		log(user + " ---------------- " + subject);
	}

}
