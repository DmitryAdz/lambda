package by.odinets.lambda.project.book;

import by.odinets.lambda.project.book.chapter1.SampleData;
import by.odinets.lambda.project.book.chapter3.Iteration;

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
		System.out.println("chapter 3 :: internalCountArtistsFromLondonPrinted () :: " + countArtistsAll);
	}

}
