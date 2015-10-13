package com.indus.training.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.indus.training.domain.CacliInput;
import com.indus.training.domain.CalciOutput;
import com.indus.training.service.ICalculator;
import com.indus.training.util.Logger;

public class Calculator implements ICalculator {
	
	Logger loggerObj = new Logger();

	public CalciOutput add(CacliInput calciInParam) {

		CalciOutput calciOutputObj = new CalciOutput();

		Properties property = new Properties();

		try {
			property.load(new FileInputStream(new File("property.properties")));
			calciOutputObj.setResult(calciInParam.getParam1()
					+ calciInParam.getParam2());
			if (property.getProperty("info").equals("true")) {
                loggerObj.getInfo();
			}
			if (property.getProperty("warnings").equals("true")) {
               loggerObj.getInfo();
			}
			if (property.getProperty("debug").equals("true")) {
               loggerObj.getInfo();
			}
			if (property.getProperty("exceptions").equals("true")) {
               loggerObj.getExceptions();
			}
			if (property.getProperty("fatal").equals("true")) {
               loggerObj.getInfo();
			}
			

		} catch (FileNotFoundException e) {
			loggerObj.saveExceptions("File not Found" + "in method add() of class=");
			e.printStackTrace();
		} catch (IOException e) {
			loggerObj.saveExceptions("IO exception" + "in method add() of class=");
			e.printStackTrace();
		} catch (NullPointerException e) {
			loggerObj.saveExceptions("Null point exception" + "in method add() of class=");
			e.printStackTrace();
		}
		return calciOutputObj;
	}


	public CalciOutput div(CacliInput calciInParam) {

		CalciOutput calciOutputObj = new CalciOutput();

		Properties property = new Properties();

		try {
			property.load(new FileInputStream(new File("property.properties")));
			calciOutputObj.setResult(calciInParam.getParam1()
					/ calciInParam.getParam2());
			loggerObj.saveExceptions("File not Found" + " in method div() of class=");
			if (property.getProperty("info").equals("true")) {
                loggerObj.getInfo();
			}
			if (property.getProperty("warnings").equals("true")) {
               loggerObj.getInfo();
			}
			if (property.getProperty("debug").equals("true")) {
               loggerObj.getInfo();
			}
			if (property.getProperty("exceptions").equals("true")) {
               loggerObj.getInfo();
			}
			if (property.getProperty("fatal").equals("true")) {
               loggerObj.getInfo();
			}
			
		} catch (FileNotFoundException e) {
			loggerObj.saveExceptions("File not Found" + " in method div() of class=");
			e.printStackTrace();
		} catch (IOException e) {
			loggerObj.saveExceptions("IO exception" + "in method div() of class=");
			e.printStackTrace();
		} catch (NullPointerException e) {
			loggerObj.saveExceptions("Null point exception" + "in method div() of class=");
			e.printStackTrace();
		} catch(ArithmeticException e){
			loggerObj.saveExceptions("ArithmeticException" + "in method div() of class=");
			e.printStackTrace();
		}
		return calciOutputObj;
	}


}
