import java.util.Scanner;

class shit{
	
	public static void main(String[] args){
	char sure;
	
	Scanner input = new Scanner(System.in);
	shitless shitty = new shitless();
	System.out.println("This is class Shit!");
	System.out.print("Input Hero's Name: ");
	shitty.hero = input.nextLine();
	System.out.print("Input Number of kills: ");
	shitty.kills = input.nextInt();
	System.out.print("Input Number of deaths: ");
	shitty.deaths = input.nextInt();
	System.out.print("Input Number of assists: ");
	shitty.assists = input.nextInt();
	System.out.print("Do u want to add the number of kills?[y/n]: ");
	sure = input.next().charAt(0);
	if (sure == 'y'){
		shitty.addkills();
	}
	else{
	System.out.print("");
 	} 
	System.out.print("How bout deaths, do you want to lessen it?[y/n]: ");
	sure = input.next().charAt(0);
	if (sure == 'y'){
		shitty.subdeaths();
	}
	else {
	System.out.println("");
	}	
	System.out.print("");
	shitty.statwrite();
		}

	}

class shitless{

	public String hero;
	public double kills;
	public double deaths;
	public double assists;

	public void addkills(){
	kills = kills + 5;
	}
	public void subdeaths(){
	deaths = deaths - 5;
	}
	public void statwrite(){
	
	System.out.println("Hero's Name: " + hero);
	System.out.println("Kills: " + kills);
	System.out.println("Deaths: " + deaths);
	System.out.println("Assists: " + assists);

}

}