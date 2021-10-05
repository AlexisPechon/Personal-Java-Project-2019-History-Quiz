/*
HistoryApp.java
A Pechon
2/8/2020
*/

import java.util.Scanner;
import sun.audio.*;
import java.io.*;

@SuppressWarnings("all")
public class HistoryApp{


	public static void main(String args[]){
		try{
			FileInputStream fileau=new FileInputStream("./assets/bgm.wav");
			AudioStream as=new AudioStream(fileau);
			AudioPlayer.player.start(as);
		}
		catch (Exception e){
			System.out.println("=================\nFile not found.\n=================");
		}

		//Game variables
		String userInput="";
		String name;
		String answer1;
		String easterEggs[]={"TheCumChalice","The Cum Chalice","Yandere Dev","YanDev","Yandev"};
		String beaches[]={"Omaha","Gold","Utah","Juno","Sword"};
		String bossAnswer="";
		int answer2;
		int answer3;
		int answer4;
		int answer5;
		int score;

		//Objects
		Scanner in = new Scanner(System.in);
		History myHistory = new History();

		//Inputs
		System.out.println("==============================================================");
		System.out.println("Ignore the warnings above. They're irrelevant.");
		System.out.println("==============================================================");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Welcome to History Trivia!");
		System.out.println("Here are the rules!");
		System.out.println();
		System.out.println("===*RULES AND INFO*===");
		System.out.println("1. There will be 5 questions, you must score 3 out of 5 to pass");
		System.out.println("2. The questions will be normal and Multiple Choice, any invalid inputs will not be rewarded");
		System.out.println("3. Invalid Inputs will deduct from your overall score");
		System.out.println("With that out of the way, tell us your name!");
		System.out.println();
		System.out.println("What is your name?");
		name=in.nextLine();

		//ERORR CHECKING IF THEY PUT IN AN EMPTY SPACE
		boolean checker=false;

		while(checker==false){
			if(name.equals("")){
				System.out.println("Please enter a valid name");
				name=in.nextLine();
				checker=false;
			}
			else if(!name.matches("[a-zA-Z_]+")){
				System.out.println("Please enter a valid name");
				name=in.nextLine();
				checker=false;
			}
			else{
				checker=true;
			}
		}

		/*End of Error Check*/

		/*Easter Egg*/
		for(int i=0;i<easterEggs.length;i++){
			if(easterEggs[i].equals(name)){
				System.out.println("===============\n= Are ya coding son? ==\n===============");
				try{
					FileInputStream fileau=new FileInputStream("./assets/win.wav");
					AudioStream as=new AudioStream(fileau);
					AudioPlayer.player.start(as);
				}
				catch(Exception e){
					System.out.print("File not found.");
				}
			}
		}
		/*End of Easter Eggs*/
		System.out.println("===============\nOkay! Let's begin!\n===============");

		boolean found=false;
		while(found==false){

			System.out.println();
			System.out.println("Question 1.");
			System.out.println("Fill in the blanks: ");
			System.out.println("BC stands for ______ Christ");
			answer1=in.next();
			myHistory.setAnswer1(answer1);
			myHistory.corrector1();

			System.out.println();
			System.out.println("Question 2.");
			System.out.println("During the Irish Potato Famine, people died on what when they were travelling in search of food.");
			System.out.println();
			System.out.println("1. Ferries");
			System.out.println("2. Coffin Ships");
			System.out.println("3. Ships");
			System.out.println("4. Train");
			answer2=in.nextInt();
			myHistory.setAnswer2(answer2);
			myHistory.corrector2();

			System.out.println();
			System.out.println("Question 3.");
			System.out.println("The famous historical building - the GPO - is tied to what part of Irish History");
			System.out.println();
			System.out.println("1. The Easter Rising");
			System.out.println("2. World War 1");
			System.out.println("3. World War 2");
			System.out.println("4. The Troubles");
			System.out.println();
			answer3=in.nextInt();
			myHistory.setAnswer3(answer3);
			myHistory.corrector3();

			System.out.println();
			System.out.println("Question 4");
			System.out.println("When was the Good Friday Agreement signed?");
			System.out.println("1. April 9th");
			System.out.println("2. September 19th");
			System.out.println("3. April 11th");
			System.out.println("4. April 10th");
			answer4=in.nextInt();
			myHistory.setAnswer4(answer4);
			myHistory.corrector4();

			System.out.println();
			System.out.println("Question 5.");
			System.out.println("Eamon de Valera and Sean Lemass were political leaders of which political party?");
			System.out.println("1. Fianna Fail");
			System.out.println("2. Fine Gael");
			answer5=in.nextInt();
			myHistory.setAnswer5(answer5);
			myHistory.corrector5();

			score=myHistory.getScore();
			if(score<3){
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("==============================================================");
				System.out.println("You didn't score enough to pass, you have to try again!");
				System.out.println("Your score was "+score);
				System.out.println("==============================================================");
				found=false;
			}
			else{
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("==============================================================");
				System.out.println("Congratulations! You passed!");
				System.out.println("Your final score is "+score);
				System.out.println("==============================================================");
				found=true;
			}

			boolean input=false;
			boolean bossQuestion=false;

			if(score==5){
				System.out.println("It seems that you have made it this far.");
				System.out.println("You've answered every question correctly.");
				System.out.println("Fair play.");
				System.out.println("But I still have one last question for you.");
				System.out.println("But I must warn you. Get this question wrong, and you start the whole quiz all over again.");
				System.out.println("Are you willing to take that risk?");
				System.out.println();
				System.out.println("Yes or No?");
				userInput=in.next();

				while(input==false){
					if(userInput.equalsIgnoreCase("Yes")){
						System.out.println("Very Brave. I hope you are ready.");
						bossQuestion=true;
						input=true;
					}
					else if(userInput.equalsIgnoreCase("No")){
						System.out.println("Wise move.");
						input=true;
					}
					else{
						System.out.println("That isn't what I am asking. Are you ready? Yes or No.");
						userInput=in.next();
						input=false;
					}
				}

				if(bossQuestion==true){
					System.out.println("===*FINAL QUESTION*===");
					System.out.println();
					System.out.println("During the D-Day Invasion, the British, Americans and Canadians stormed various beaches.");
					System.out.println("Name one of the beaches that those countries raided.");
					bossAnswer=in.next();


					for(int i=0; i<beaches.length; i++){
						if(bossAnswer.equals(beaches[i])){
							System.out.println("Congratulations! You've beaten the game!");
						}
					}
				}
			}
		}//End of while loop
		System.out.println(" ");
		System.out.println("Thanks for playing!");
	}
}