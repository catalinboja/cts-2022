package ro.ase.acs.cts.design.patterns.proxy.virtual;

import ro.ase.acs.cts.initial.image.Image;
import ro.ase.acs.cts.initial.image.ImageInterface;

public class Main {

	public static void main(String[] args) {
		ImageInterface img1 = 
				new Image("Car.png");
				
        final ImageInterface IMAGE1 = 
        		new ImageProxy("Photo1");
        final ImageInterface IMAGE2 = 
        		new ImageProxy("Photo2");
        
		//we do a lot of other things
        //the image is not loaded in memory
		System.out.println("Do other stuff");
		
		//image is loaded when is needed
		
        IMAGE1.displayImage();
        IMAGE1.displayImage();
        IMAGE2.displayImage();
        IMAGE2.displayImage();
        IMAGE1.displayImage();
        
	}

}
