package testone.algoes;

public class MyFibonacci {

	public static void main(String[] args) {
	
		int febCount = 10;
		
		int[] febSer = new int[febCount];
		
		febSer[0] = 0;
		febSer[1] = 1;
		
		for(int i=2; i < febCount; i++){
			
			febSer[i] = febSer[i-1] + febSer[i-2];
		}
		
		for (int i =0; i < febCount; i++ ){
			System.out.print(febSer[i]+ ",");
		}
		

	}

}
