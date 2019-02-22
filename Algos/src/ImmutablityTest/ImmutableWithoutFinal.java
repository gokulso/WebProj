package ImmutablityTest;

public class ImmutableWithoutFinal {
	
	   /**
	    * String class is immutable as it also does not provide setter to change its content
	    * */
	    private final  String immutableField;
	    
	    private ImmutableWithoutFinal(String str) {
	    	this.immutableField = str;
	    }
	    
	    public static ImmutableWithoutFinal create(String str) {
	    	return new ImmutableWithoutFinal(str);
	    }
	    
	    public String getImmutableField() {
	    	return immutableField;
	    }

		@Override
		public String toString() {
			return " [immutableField=" + immutableField + "]";
		}
	    
	    

}
