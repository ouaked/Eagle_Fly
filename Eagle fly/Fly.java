public interface Fly {
	/*
	 * • takeOff with no arguments, and returns nothing
	 * 
	 * • ascend which takes an integer meters as an argument, and returns an integer
	 * 
	 * • descend which takes an integer meters as an argument, and returns an
	 * integer
	 * 
	 * • land with no arguments, which returns nothing
	 * 
	 * • glide, with no arguments, which returns nothing and has a default
	 * behaviour: displaying the text "glides into the air."
	 */

	void takeOff();
	
	int ascend(int meters);
		
	int descend(int meters);
	
	void land();
	
	void glide();



}