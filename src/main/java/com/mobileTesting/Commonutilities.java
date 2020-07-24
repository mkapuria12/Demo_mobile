package com.mobileTesting;

import java.io.FileInputStream;
import java.util.Properties;

public class Commonutilities {

	public void loadPropertyFiles() throws Exception
	{
		String sPath=System.getProperty("user.dir")+"/config.properties";
		Properties prop=new Properties();
		FileInputStream fi=new FileInputStream(sPath);
		prop.load(fi);
		System.getProperties().putAll(prop);
	}
	
}
