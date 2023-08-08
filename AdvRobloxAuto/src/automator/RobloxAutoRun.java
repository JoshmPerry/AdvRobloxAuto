package automator;


public class RobloxAutoRun implements Runnable{
	
	String file;
	
	public RobloxAutoRun(String ab) {
		file = ab;
	}
	
	@Override
	public void run() {
		//System.out.println(file);
		Manager runner = new Manager(file+"rd.txt");
		ImgProcessor recognize = new ImgProcessor(file+"img");
		recognize.setImg();
		while(true) {
		System.out.println("Go");
		if(recognize.checkImage(99)) {
			System.out.println("Good");
			runner.play();
		}
		}
	}
	
	public static void main(String[] args) {
		Manager runner = new Manager("rebirthrd.txt");
		while(true) {
		runner.play();
		}
	}
	
}
