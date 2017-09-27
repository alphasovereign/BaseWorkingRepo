package com.model.controller;

import com.app.api.Android;
import com.app.model.HTC;
import com.app.model.Samsung;

public class Controller {

	public Android getME(String phoneModel){
		
		if (phoneModel.equals("Samsung")) {
			return new Samsung();
		}

		else if (phoneModel.equals("HTC")) {
			return new HTC();
		}

		return null;
	}
	
	
	public Android getME(){
	
		return new Samsung();
	}
}
