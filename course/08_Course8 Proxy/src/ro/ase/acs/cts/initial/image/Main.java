package ro.ase.acs.cts.initial.image;

public class Main {

	public static void main(String[] args) {
		ImageInterface img1 = 
				new Image("Car.png");
		
		//we do a lot of other things
		//but the image is already loaded in memory
		System.out.println("Do other stuff");
		
		img1.displayImage();
		img1.displayImage();
		img1.displayImage();
		
	}

}
