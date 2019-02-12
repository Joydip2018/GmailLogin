package Gmail.Gmail;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Gmaillogintest extends BaseClass 
{
	@Test
	public void Verificationtest() throws Exception
	{
		loginpageelement GL= PageFactory.initElements(Driver, loginpageelement.class);;
		GL.Glogin("joydip.ilfs@gmail.com", "Test@123");
	}
}
