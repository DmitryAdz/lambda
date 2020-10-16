package by.odinets.lambda.project.book.chapter5.collectors;

import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Stream;

import by.odinets.lambda.project.book.chapter1.Artist;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.comparing;

import java.util.Optional;

public class CollectorsExample {

	public void toCollectionTreeSet() {
		
		Stream<Integer> stream = Stream.of(1, 2, 3, 4);
		stream.collect(toCollection(TreeSet::new));
		System.out.println("toCollectionTreeSet() :: stream :: " + stream);
	}
	
	public Optional<Artist> biggestGroup(Stream<Artist> artists) {
		Function<Artist, Long> getCount = artist -> artist.getMembers().count();
		return artists.collect(maxBy(comparing(getCount)));
	}
}
