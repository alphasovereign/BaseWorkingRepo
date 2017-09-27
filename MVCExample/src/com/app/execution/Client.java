package com.app.execution;

import java.util.ResourceBundle.Control;


import com.app.view.Presentation;
import com.model.controller.Controller;

public class Client {

	 Presentation view ;
	 Controller controller ;
	 
	 public void init(){
		view = new Presentation();
		controller = new Controller();
	 }
	 
	 
	public static void main(String[] args) {
	
		
		Client c = new Client();
		c.init();
		
		c.view.displayPhone(
				
				c.controller.getME("HTC")
				);
		
		
	}
	
}
