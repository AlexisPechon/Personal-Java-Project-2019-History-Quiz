/*
History.java
A Pechon
2/8/2020
*/
import sun.audio.*;
import java.io.*;

public class History{
	
	//Data Members
	private String answer1;
	private int answer2;
	private int answer3;
	private int answer4;
	private int answer5;
	private String bossAnswer;
	private int score;
	private String name;
	private String beaches[]={"Omaha","Gold","Utah","Juno","Sword"};
	private boolean secretEnding=false;
	private boolean found=false;
	//Answers: Before, 2, 1, 4, 1, Omaha
	


		
	//Constructor
	public History(){
		answer1="";
		answer2=0;
		answer3=0;
		answer4=0;
		answer5=0;
		bossAnswer="";
		score=0;
	}

	
	//Setters
	public void setAnswer1(String answer1){
		this.answer1=answer1;
	}
	public void setAnswer2(int answer2){
		this.answer2=answer2;
	}
	public void setAnswer3(int answer3){
		this.answer3=answer3;
	}
	public void setAnswer4(int answer4){
		this.answer4=answer4;
	}
	public void setAnswer5(int answer5){
		this.answer5=answer5;
	}
	public void setBossAnswer(String bossAnswer){
		this.bossAnswer=bossAnswer;
	}
	

	
	//Process
	public void corrector1(){
		if(answer1.equalsIgnoreCase("Before")){
			try{
				FileInputStream fileau=new FileInputStream("./assets/correct.wav");
				AudioStream as=new AudioStream(fileau);
				AudioPlayer.player.start(as);
			}
			catch(Exception e){
				System.out.print("File not found.");
			}
			System.out.println(" ");
				System.out.println("=============\n1. Correct!\n=============");
			score=0;
			score++;
		}
		else{
			System.out.println("Incorrect!");
			score=0;
		}

	}
	
	public void corrector2(){
		if(answer2 == 2){
			try{
					FileInputStream fileau=new FileInputStream("./assets/correct.wav");
					AudioStream as=new AudioStream(fileau);
					AudioPlayer.player.start(as);
				}
				catch(Exception e){
					System.out.print("File not found.");
				}
				System.out.println(" ");
				System.out.println("=============\n2. Correct!\n=============");
				score++;
		}
		else{
			System.out.println("Incorrect.");
		}
	}

	public void corrector3(){
		if(answer3 == 1){
			try{
					FileInputStream fileau=new FileInputStream("./assets/correct.wav");
					AudioStream as=new AudioStream(fileau);
					AudioPlayer.player.start(as);
				}
				catch(Exception e){
					System.out.print("File not found.");
				}
				System.out.println(" ");
				System.out.println("=============\n3. Correct!\n=============");
				score++;
		}
		else{
			System.out.println("Incorrect.");
		}
	}

	public void corrector4(){
		if(answer4 == 4){
			try{
					FileInputStream fileau=new FileInputStream("./assets/correct.wav");
					AudioStream as=new AudioStream(fileau);
					AudioPlayer.player.start(as);
				}
				catch(Exception e){
					System.out.print("File not found.");
				}
				System.out.println(" ");
				System.out.println("=============\n4. Correct!\n=============");
				score++;
		}
		else{
			System.out.println("Incorrect.");
		}
	}

	public void corrector5(){
		if(answer5 == 1){
			try{
					FileInputStream fileau=new FileInputStream("./assets/correct.wav");
					AudioStream as=new AudioStream(fileau);
					AudioPlayer.player.start(as);
				}
				catch(Exception e){
					System.out.print("File not found.");
				}
				System.out.println(" ");
				System.out.println("=============\n5. Correct!\n=============");
				score++;
		}
		else{
			System.out.println("Incorrect.");
		}
	}
	
	//public void bossAnswer()

	//
	
	//Getters
	public int getScore(){
		return score;
	}
}