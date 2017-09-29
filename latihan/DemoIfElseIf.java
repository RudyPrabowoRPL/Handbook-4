	public class DemoIfElseIf {
		public static void main(String[] args) {
			double grande = 92.0;
			if( grande >= 90 ){
				System.out.printIn("Excellent!");
			}else if( (grande < 90) && (grande >= 80)){
				System.out.printIn("Good job!" );
			}else if( (grande < 80) && (grande >= 60)){
				System.out.printIn("Study harder!" );
			}else {
				System.out.printIn("Sorry, you failed." );
			}
		}
	}