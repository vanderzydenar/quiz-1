import java.util.Scanner;

public class Thrice_turn
{  
  public static void main ( String[] args )  
  {
    int tripletWorth = 0;
    int tally = 0;
    int diceChoice = 0;
    int roll = 0;
    int dice1 = 1;
    int dice2 = 2;
    int dice3 = 3;
    int sum = dice1 + dice2 + dice3;

    while(dice1 != dice2 && dice2 != dice3){
        dice1 = (int)(Math.random()*6+1);
        dice2 = (int)(Math.random()*6+1);
        dice3 = (int)(Math.random()*6+1);       
        sum = sum;
        if(dice1 == dice2 && dice2 == dice3 && roll < 3){
            tally = sum;
            break;
        } else if(dice1 == dice2 && dice2 == dice3 && roll > 3){
            tally =- sum;
            roll = 0;
            break;
        }
    }
    roll += 1;

    /*

    Scanner scan = new Scanner( System.in );

    System.out.println("What dice do you want to use as your Triplet's Worth? 1, 2, 3?:");

    int response = scan.nextInt();

    if(response == 1){
        diceChoice = dice1;
    } else if(response == 2){
        diceChoice = dice2;
    } else if(response == 3){
        diceChoice = dice3;
    }

    */

    tripletWorth = dice1;

    for(int x = 0; x < tripletWorth + 1; x++){
        dice1 = (int)(Math.random()*6+1);
        dice2 = (int)(Math.random()*6+1);
        dice3 = (int)(Math.random()*6+1);
        if(x == tripletWorth){
            tally += dice1 * dice2 * dice3;
            break;
        }
    }


    System.out.println(tally);

    







        
  }
}