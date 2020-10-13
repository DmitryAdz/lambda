package by.odinets.lambda.project.book;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import by.odinets.lambda.project.book.chapter1.Album;
import by.odinets.lambda.project.book.chapter1.SampleData;
import by.odinets.lambda.project.book.chapter3.Iteration;
import by.odinets.lambda.project.book.chapter3.desicion_origins.Decisions;
import by.odinets.lambda.project.book.chapter3.long_track_finder.Step0LongTrackFinder;
import by.odinets.lambda.project.book.chapter3.long_track_finder.Step1LongTrackFinder;
import by.odinets.lambda.project.book.chapter3.long_track_finder.Step2LongTrackFinder;
import by.odinets.lambda.project.book.chapter3.long_track_finder.Step3LongTrackFinder;
import by.odinets.lambda.project.book.chapter3.long_track_finder.Step4LongTrackFinder;
import by.odinets.lambda.project.book.chapter4.logger.Logger;
import by.odinets.lambda.project.book.chapter4.parent_child.ChildImpl;
import by.odinets.lambda.project.book.chapter4.parent_child.ParentImpl;

public class RunApplication {

	public static void main(String[] args) {
		
		Iteration iteration = new Iteration();
		
		int countAllArtists = 0;
		countAllArtists = iteration.externalCountArtistsFromLondon(SampleData.getAllArtists());
		System.out.println("chapter3 :: externalCountArtistsFromLondon() :: " + countAllArtists);
		
		countAllArtists = 0;
		countAllArtists = iteration.externalCountArtistsFromLondonExpanded(SampleData.getAllArtists());
		System.out.println("chapter3 :: externalCountArtistsFromLondonExpanded() :: " + countAllArtists);
		
		long countArtistsAll = 0l;
		countArtistsAll = iteration.internalCountArtistsFromLondon(SampleData.getAllArtists());
		System.out.println("chapter3 :: internalCountArtistsFromLondon() :: " + countArtistsAll);
		
		iteration.filterArtistsFromLondon(SampleData.getAllArtists());
		System.out.println("chapter3 :: filterArtistsFromLondon() ");
		
		iteration.filterArtistsFromLondonPrinted(SampleData.getAllArtists());
		System.out.println("chapter3 :: filterArtistsFromLondonPrinted() ");
		
		countArtistsAll = 0l;
		countArtistsAll = iteration.internalCountArtistsFromLondonPrinted(SampleData.getAllArtists());
		System.out.println("chapter3 :: internalCountArtistsFromLondonPrinted () :: " + countArtistsAll);
		
		System.out.println("//---------------------------------------------------------------------------------------------");
		
		Decisions decision = new Decisions();
		Decisions.Imperative decisionImperative = new Decisions.Imperative();
		
		Album albumTest = SampleData.testShortAlbum;
		Set<String> test = new HashSet<>();
		test = decisionImperative.originsOfBands(albumTest);
		System.out.println("chapter3 :: decisionImperative.originsOfBands() :: test :: " + test);
		test.clear();
		
		test = decision.originsOfBandsMisuse(albumTest);
		System.out.println("chapter3 :: decision.originsOfBandsMisuse() :: test :: " + test);
		test.clear();
		
		test = decision.originsOfBands(albumTest);
		System.out.println("chapter3 :: decision.originsOfBands() :: test :: " + test);
		test.clear();
		
		System.out.println("//---------------------------------------------------------------------------------------------");
		
		Step0LongTrackFinder step0 = new Step0LongTrackFinder();
		Step1LongTrackFinder step1 = new Step1LongTrackFinder();
		Step2LongTrackFinder step2 = new Step2LongTrackFinder();
		Step3LongTrackFinder step3 = new Step3LongTrackFinder();
		Step4LongTrackFinder step4 = new Step4LongTrackFinder();
		
		List<Album> albumList = SampleData.albumList;
		Set<String> trackNames = new HashSet<>();
		trackNames = step0.findLongTracks(albumList);
		System.out.println("chapter3 :: step0.findLongTracks() :: trackNames :: " + trackNames);
		trackNames.clear();
		
		trackNames = step1.findLongTracks(albumList);
		System.out.println("chapter3 :: step1.findLongTracks() :: trackNames :: " + trackNames);
		trackNames.clear();
		
		trackNames = step2.findLongTracks(albumList);
		System.out.println("chapter3 :: step2.findLongTracks() :: trackNames :: " + trackNames);
		trackNames.clear();
		
		trackNames = step3.findLongTracks(albumList);
		System.out.println("chapter3 :: step3.findLongTracks() :: trackNames :: " + trackNames);
		trackNames.clear();
		
		trackNames = step4.findLongTracks(albumList);
		System.out.println("chapter3 :: step4.findLongTracks() :: trackNames :: " + trackNames);
		trackNames.clear();
		
		System.out.println("//---------------------------------------------------------------------------------------------");
		
		//chapter4
		Logger logger = new Logger();
		if(logger.isDebugEnabled()) {
			logger.debug("Look at this: " + logger.expensiveOperation());
		}
		
		Logger logger1 = new Logger();
		logger1.debug(() -> "Look at this: " + logger1.expensiveOperation());
		
		System.out.println("//---------------------------------------------------------------------------------------------");
		
		//chapter 4
		ParentImpl parentImpl = new ParentImpl();
		parentImpl.parentDefaultUsed();
		
		ChildImpl childImpl = new ChildImpl();
		childImpl.childOverrideDefault();
	}

}
