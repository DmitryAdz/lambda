package by.odinets.lambda.project.book.chapter4.logger;

import java.util.function.Supplier;

public class Logger {

	private boolean debug = true;
	
	public boolean isDebugEnabled() {
		return debug;
	}
	
	public void debug(String message) {
		System.out.println("debug() ::");
		if(isDebugEnabled()) {
			System.out.println(message);
		}
	}
	
	public String expensiveOperation() {
		return " expensiveOperation() ";
	}
	
	//for lambda
	public void debug(Supplier<String> message) {
		System.out.println("debug() lambda ::");
		if(isDebugEnabled()) {
			debug(message.get());
		}
	}
	
}
