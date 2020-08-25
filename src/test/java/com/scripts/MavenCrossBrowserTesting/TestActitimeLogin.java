package com.scripts.MavenCrossBrowserTesting;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.MavenCrossBrowserTesting.BaseTest;
import com.pages.MavenCrossBrowserTesting.POMActitimeLoginPages;

public class TestActitimeLogin extends BaseTest
{
	@Test
	public void login() throws IOException
	{
		POMActitimeLoginPages login=new POMActitimeLoginPages(driver);
		login.loginMethod();
	}
 
}
