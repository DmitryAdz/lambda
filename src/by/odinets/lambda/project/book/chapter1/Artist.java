package by.odinets.lambda.project.book.chapter1;

import java.util.Collections;
import java.util.List;

public class Artist {
	
	private String name;
	private List<Artist> members;
	private String nationality;
	
	static List<Artist> membersEmpty = Collections.emptyList();	//формируется пустая коллекция
	
	public Artist(String name, String nationality) {
		this(name, membersEmpty, nationality);
	}
	
	public Artist(String name, List<Artist> members, String nationality) {
		this.name = name;
		this.members = members;
		this.nationality = nationality;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Artist> getMembers() {
		return members;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public boolean isFrom(String nationality) {
		/*boolean result = false;
		if(nationality.equals(this.nationality)) {
			result = true;
		}
		return result;*/
		return this.nationality.equals(nationality);
	}
		
	
}
