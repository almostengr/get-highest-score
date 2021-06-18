
public class BoboAndTheLockers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// true = open ; false = close 
		boolean[] lockers = new boolean[1001];
		
		// close all the lockers
		for (int i = 1; i <= 1000; i++) {
			lockers[i] = false; 
		}
		
		for (int skip = 1; skip <= 1000; skip++){
			System.out.println("Bobo is changing every " + skip + " lockers.");
			
			for(int locker = skip; locker < 1000; locker += skip) {
				// reverse locker; open if closed, close if open
				lockers[locker] = !lockers[locker]; 			
			}
		}
		
		System.out.println("Bobo is bored so now he's going home.");
		
		// count open lockers
		String list = "";
		int openCount = 0; 
		for (int i = 1; i <= 1000; i++){
			if(lockers[i] == true){
				openCount++;
				list += i + " " ; 
			}
		}
		
		System.out.println("Bobo left " + openCount + " lockers open.");
		System.out.println("The open lockers are: " + list);
	} // end main
} // end class
