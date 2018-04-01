package com.hit.driver;

import java.io.IOException;
import com.hit.Controller.MMUController;

public class MMUServerDriver 
{
	public static void main(String[] args) throws IOException {
		System.out.println("server is up");
		new MMUController().start();
	}


}
