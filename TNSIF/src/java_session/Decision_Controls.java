package java_session;

public class Decision_Controls {
		public static void main(String[] args) {

			int score = 55;

			switch (score / 10) {
			    case 10: // For scores 100
			    case 9:  // For scores 90-99
			        System.out.println("A");
			        break;
			    case 8:  // For scores 80-89
			        System.out.println("B");
			        break;
			    case 7:  // For scores 70-79
			    case 6:  // For scores 60-69
			        System.out.println("C");
			        break;
			    case 5:  // For scores 50-59
			        System.out.println("D");
			        break;
			    default: // For scores below 50
			        System.out.println("Score is less");
			        break;
			}
			
			

			}
	}
