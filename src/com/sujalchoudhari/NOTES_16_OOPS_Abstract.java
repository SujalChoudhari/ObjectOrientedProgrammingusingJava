package com.sujalchoudhari;

abstract class MultiMedia{
	abstract void reachAudience();
}

class Image extends MultiMedia{
	@Override
	void reachAudience(){
		System.out.println("Reaching in the form of Images");
	}
}

class Text extends MultiMedia{
	@Override
	void reachAudience(){
		System.out.println("Reaching in the form of Text walls");
	}
}

abstract class Internet extends MultiMedia{
	void reachAudienceFast() {
		System.out.println("Reaching Very Very Fast");
	}
}


public class NOTES_16_OOPS_Abstract {

	public static void main(String[] args) {
		//MultiMedia m = new MultiMedia();  Cannot Instantiate Abstract Classes
		
		// Use Inherited classes instead
		Image img = new Image(); img.reachAudience();
		Text txt = new Text(); txt.reachAudience();
		//Internet in = new Internet(); Internet is abstract cannot Instantiate

	}

}
