package by.odinets.lambda2.long_tracks;

public class Track {

	int length = 0;
	String name = "";
	
	public Track() {
		
	}
	
	public Track(int length, String name) {
		this.length = length;
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public String getName() {
		return name;
	}
	
}
