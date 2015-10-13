package com.indus.training.service;

import com.indus.training.domain.CacliInput;
import com.indus.training.domain.CalciOutput;

public interface ICalculator {

	public CalciOutput add(CacliInput calciOutParam) ;
	
	public CalciOutput div(CacliInput calciOutParam) ;


}
