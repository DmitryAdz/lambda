package by.odinets.lambda.project.book.chapter4.optional;

import java.util.Optional;

public class OptionalBegin {

	Optional<String> testA = Optional.of("testA");
	Optional<String> emptyOptional = Optional.empty();
	Optional<String> alsoEmpty = Optional.ofNullable(null);
	
	public OptionalBegin() {
		System.out.println("OptionalBegin :: testA :: " + testA.get());
		System.out.println("OptionalBegin :: testA.isPresent() :: " + testA.isPresent());
		System.out.println("OptionalBegin :: emptyOptional :: " + emptyOptional);
		System.out.println("OptionalBegin :: emptyOptional.isPresent() :: " + emptyOptional.isPresent());
		System.out.println("OptionalBegin :: emptyOptional.orElse(\"testB\") :: " + emptyOptional.orElse("testB"));
		System.out.println("OptionalBegin :: emptyOptional.orElseGet(() -> \"testB\") :: " + emptyOptional.orElseGet(() -> "testB"));
		System.out.println("OptionalBegin :: alsoEmpty :: " + alsoEmpty);
		System.out.println("OptionalBegin :: alsoEmpty.isPresent() :: " + alsoEmpty.isPresent());
		System.out.println("OptionalBegin :: alsoEmpty.orElse(\"testC\") :: " + emptyOptional.orElse("testC"));
		System.out.println("OptionalBegin :: alsoEmpty.orElseGet(() -> \"testC\") :: " + emptyOptional.orElseGet(() -> "testC"));
		
	}
	
}
