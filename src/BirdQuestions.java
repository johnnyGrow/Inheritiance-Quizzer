import java.util.Scanner;

public class BirdQuestions
	{
		public void Quest1()
			{
		Scanner userInput=new Scanner(System.in);

		System.out.println("If you were to umcomment the following lines, what would the program print:");
		System.out.println("Bird b = new Bird();");
		System.out.println("b.birdsOfPrey();");
		System.out.println("b.birdsOfTheEverglades();");
		String answer=userInput.nextLine();
		if(answer.equals(" "));
			{
				System.out.println("Birds are awesome! Birds of prey, also known as raptors, hunt and feed on other animals. The Everglades is known for its many wading birds, such as egrets, herons and wood storks, but it also hosts huge numbers of smaller migratory birds.");

			}
			}
	}
