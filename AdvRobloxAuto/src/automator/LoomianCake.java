package automator;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class LoomianCake {

	public static void click(){
		Robot r;
		try {
			r = new Robot();
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(50);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
	
	public static void click(int x,int y) {
		Robot r;
		try {
		r = new Robot();
		r.mouseMove(x, y);
		Thread.sleep(50);
		r.mouseMove(x+1, y+1);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(50);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public static boolean checkColor(int x,int y, Color a){
		int d=20;
		try {
			Robot r = new Robot();
			if((r.getPixelColor(x,y).getRed()>=a.getRed()-d&&r.getPixelColor(x,y).getRed()<=a.getRed()+d)&&(r.getPixelColor(x,y).getGreen()>=a.getGreen()-d&&r.getPixelColor(x,y).getGreen()<=a.getGreen()+d)&&(r.getPixelColor(x,y).getBlue()>=a.getBlue()-d&&r.getPixelColor(x,y).getBlue()<=a.getBlue()+d))
			return true;
			return false;
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		}
	
	public static void main(String[] args) {
		Thread redeem = new Thread(new RobloxAutoRun("finished"));
		ImgProcessor hitPlayimg = new ImgProcessor("hitPlayimg");
		hitPlayimg.setImg();
		ImgProcessor inBackgroundimg = new ImgProcessor("inBackgroundimg");
		inBackgroundimg.setImg();
		ImgProcessor Loadingimg = new ImgProcessor("Loadingimg");
		Loadingimg.setImg();
		ImgProcessor disconnectedimg = new ImgProcessor("disconnectedimg");
		disconnectedimg.setImg();
		ImgProcessor hitcontinue = new ImgProcessor("hitcontinueimg");
		hitcontinue.setImg();
		Manager hitcontinuerd = new Manager("hitcontinuerd");
		ImgProcessor incakeimg = new ImgProcessor("incakeimg");
		incakeimg.setImg();
		incakeimg.setError(20);
		Manager incakerd = new Manager("incakerd.txt");
		
		int checkX = 863;
		int checkY = 958;
		Color checkCol = new Color(48,48,48);
		int colorX = 376;
		int colorY = 646;
		Color color1 = new Color(230,228,136);
		Color color2 = new Color(140,112,80);
		Color color3 = new Color(196,56,66);
		int but1X = 612;
		int but1Y = 789;
		Color but1 = new Color(238,250,176);
		Color but2 = new Color(115,75,56);
		Color but3 = new Color(179,19,33);
		int but2X = 956;
		int but2Y = 814;
		int but3X = 1300;
		int but3Y = 820;
		
		redeem.start();
		while(true) {
			//System.out.println("running");

			if(Loadingimg.checkImage()) {
			while(Loadingimg.checkImage()) {
				if(inBackgroundimg.checkImage()) {
					click(1089,559);
				}
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(hitcontinue.checkImage(99)) {
				hitcontinuerd.play();
			}else if(incakeimg.checkImage(80)) {
				incakerd.play();
				if(!checkColor(checkX,checkY,checkCol))
					click(1899,11);
			} else {
				click(1899,11);
			}
			System.out.println("Done");
			}
			
			if(hitPlayimg.checkImage()) {
				click(427,827);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(disconnectedimg.checkImage())
				click(1899,11);
			
				if(checkColor(checkX,checkY,checkCol)){
					System.out.println("running2");

				if(checkColor(colorX,colorY,color1)){

				if(checkColor(but1X,but1Y,but3)){
				click(but3X,but3Y);
				click();

				}else if(checkColor(but1X,but1Y,but2)){
				click(but2X,but2Y);
				click();
				}else if(checkColor(but1X,but1Y,but1)){
				click(but1X+5,but1Y+5);
				click();

				}

				} else if(checkColor(colorX,colorY,color2)){

				if(checkColor(but1X,but1Y,but3)){
				click(but2X,but2Y);
				click();
				}else if(checkColor(but1X,but1Y,but2)){
				click(but1X+5,but1Y+5);
				click();

				}else if(checkColor(but1X,but1Y,but1)){
				click(but3X,but3Y);
				click();

				}

				} else if(checkColor(colorX,colorY,color3)){

				if(checkColor(but1X,but1Y,but3)){
				click(but1X+5,but1Y+5);
				click();

				}else if(checkColor(but1X,but1Y,but2)){
				click(but3X,but3Y);
				click();

				}else if(checkColor(but1X,but1Y,but1)){
				click(but2X,but2Y);
				click();
				}
				}
				}
			
			
			
		}
	}
}
