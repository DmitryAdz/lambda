package by.odinets.lambda1;

public class Artist {
	
	String city = ""; 
	String name = "";

	public Artist() {
		
	}
	
	public Artist(String city, String name) {
		this.city = city;
		this.name = name;
	}
	
	public boolean isFrom(String city) {
		if(city != null && city.equals(this.city)) {
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}
	
}


