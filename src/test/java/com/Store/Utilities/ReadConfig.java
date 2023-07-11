package com.Store.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
String path="E:\\java programms\\MyStore\\Configuration\\properties.config";

public ReadConfig() {
	 try {
	 pro=new Properties();
FileInputStream File= new FileInputStream(path);
		 pro.load(File);
	} 
	 catch (Exception e) 
	 {
		e.printStackTrace();
	}}
	 
	 public String getbaseUrl()
	 {
		 String value=pro.getProperty("baseUrl");
		 if(value!=null)
		return value;
		 else 
			 {
			 throw  new RuntimeException("url not specified in config file");
			 }
	 }
	 
	 public String getbrowser()
	 {
		 String value=pro.getProperty("browser");
		 if(value!=null)
				return value;
				 else 
					 {
					 throw  new RuntimeException("browser not specified in config file");
					 }
	 }}
