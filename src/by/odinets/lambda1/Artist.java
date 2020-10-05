package by.odinets.lambda1;

public class Artist {
	
	String city = ""; 
	String name = "";
	String nationality = "";

	public Artist() {
		
	}
	
	public Artist(String city, String name) {
		this.city = city;
		this.name = name;
	}
	
	public Artist(String city, String name, String nationality) {
		this.city = city;
		this.name = name;
		this.nationality = nationality;
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

	public String getNationality() {
		return nationality;
	}
	
}


