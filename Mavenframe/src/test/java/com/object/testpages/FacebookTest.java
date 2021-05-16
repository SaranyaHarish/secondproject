package com.object.testpages;

import org.junit.Test;

import com.object.pages.Basepage;
import com.object.pages.Facebook;

public class FacebookTest {

	Basepage bp;
	Facebook fb;
	
	public FacebookTest(){
		bp=new Basepage();
		fb=new Facebook();
	}
	
	
	@Test
	public void openFaceBook(){
		bp.setText(fb.getEmaidId(), "saranya_1511@yahoo.co.in");
		bp.setText(fb.getPass(), "saranya");
		bp.buttonClick(fb.getButton());
		
		
	}
}
