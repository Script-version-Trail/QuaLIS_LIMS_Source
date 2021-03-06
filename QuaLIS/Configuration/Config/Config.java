package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;

public class Config
{
	
	public static String limsProperties="LIMS.properties";
	
	public static String FTPproperties="FTP.properties";
	
	public static String configJar;
	
	public static String driverJar;
	
	public static WebDriver driver;
	
	public static String lims;
	
	public static String userName;
	
	public static String passWord;
	
	public static String userRole;
	
	public static String latestChromeVersion;
	
	public static String FTPUserName;
	
	public static String FTPPort;
	
	public static String FTPPassword;
	
	public static String FTPFolder;
	
	public static String FTPHost;
	
	public static String project;
	
	public static String screenshot;
	
	public static int wait;
	
	public static int smartWait;
	
	public static String testOutputFolderName;
	
	public static String logFolderName;
	
	public static String reportFolderName;
	
	public static String screenshotFolderName;
	
	public static String excelReportFolderName;
	
	public static String extentReportFolderName;
	
	 
	public static void configProperties() throws IOException
	{
		FileInputStream fis=new FileInputStream(limsProperties);
		
		Properties properties = new Properties();

		properties.load(fis);	
		
		FileInputStream fis2=new FileInputStream(FTPproperties);
		
		Properties properties2 = new Properties();

		properties2.load(fis2);	
	 		
		lims=properties.getProperty("lims");
			
		userName=properties.getProperty("userName");
		
		passWord=properties.getProperty("passWord");
			
		FTPUserName=properties2.getProperty("FTPUser");
		
		FTPPort=properties2.getProperty("FTPPort");
			
		FTPPassword=properties2.getProperty("FTPPassword");
		
		FTPFolder=properties2.getProperty("FTPFolder");
		
		FTPHost=properties2.getProperty("FTPHost");
		
		project=properties.getProperty("project");
		
		userRole=properties.getProperty("userRole");
		
		screenshot=properties.getProperty("screenshot");

		wait = Integer.parseInt(properties.getProperty("wait"));

		smartWait = Integer.parseInt(properties.getProperty("smartWait"));

		logFolderName = properties.getProperty("logFolderName");

		reportFolderName = properties.getProperty("reportFolderName");

		screenshotFolderName = properties.getProperty("screenshotFolderName");

		excelReportFolderName = properties.getProperty("excelReportFolderName");

		extentReportFolderName = properties.getProperty("extentReportFolderName");
		
		testOutputFolderName = properties.getProperty("testOutputFolderName");
	 
	}
}
