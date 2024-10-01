package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
     Properties pro;
	
	String path = "D:\\selenium\\HospitalManagementSystem\\src\\test\\resources\\configuration\\Config.properties";
	
	public ReadConfig()
	{
		
		pro = new Properties();
		
		
		try {
			
			pro = new Properties();
		
			FileInputStream fis = new FileInputStream(path);
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String Url = pro.getProperty("baseUrl");
		
		return Url;
	}
	
	public String getUsername()
	{
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
	  String password = pro.getProperty("password");
	  return password;
	}
}
