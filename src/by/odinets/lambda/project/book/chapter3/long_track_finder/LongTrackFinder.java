package by.odinets.lambda.project.book.chapter3.long_track_finder;

import java.util.List;
import java.util.Set;

import by.odinets.lambda.project.book.chapter1.Album;

public interface LongTrackFinder {

	public Set<String> findLongTracks(List<Album> albums);
}
