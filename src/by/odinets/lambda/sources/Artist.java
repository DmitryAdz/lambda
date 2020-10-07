package by.odinets.lambda.sources;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.nio.charset.Charset.defaultCharset;
import static java.util.Comparator.comparing;
import static java.util.Map.Entry;
import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Artist {

	String city = ""; 
	String name = "";
	String nationality = "";
	List<Artist> members;

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
	
	public Artist(String city, String name, String nationality, List<Artist> members) {
		this.city = city;
		this.name = name;
		this.nationality = nationality;
		this.members = new ArrayList<>(members);
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

	 public Stream<Artist> getMembers() {
	        return members.stream();
    }
	
	public boolean isSolo() {
		return members.isEmpty();
	}
	
	//нахождение группы с наибольшим числом участников
	public Optional<Artist> biggestGroup(Stream<Artist> artists) {
		Function<Artist, Long> getCount = artist -> artist.getMembers().count();
		Optional<Artist> test = artists.collect(maxBy(comparing(getCount)));
		return test;
	}
	
	//разбиение потока
	public Map<Boolean, List<Artist>> bandAndSolo(Stream<Artist> artists) {
		return artists.collect(partitioningBy(artist -> artist.isSolo()));
	}
	public Map<Boolean, List<Artist>> bandAndSoloRef(Stream<Artist> artists) {
		return artists.collect(partitioningBy(Artist::isSolo));
	}
	
}
