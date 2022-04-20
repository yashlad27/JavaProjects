public class methods {
    public static void main(String[] args) {
        calculateScore(true, 800, 30, 60);
        displayHighScorePosition("Rudy", 8);
        calculateHighScore(1500);
        calculateHighScore(900);
        calculateHighScore(400);
        calculateHighScore(50);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int final_score = score+(levelCompleted*bonus);
            final_score+=1000;
            System.out.println("Your Final Score was "+final_score);
        }else{
            return -1;
        }
        return score;
    }
    public static void displayHighScorePosition(String Name, int position){
        System.out.println("Name of player is: "+Name);
        System.out.println("Position of player is: "+position);
        System.out.println(Name+" managed to get into position "+position+" on the high score table.");
    }
    public static int calculateHighScore(int playerScore){
        int playerPosition;
        if(playerScore>1000){
            playerPosition = 1;
            System.out.println("Position achieved by Player is: "+playerPosition);
        }
        else if(playerScore>500 && playerScore<1000){
            playerPosition=2;
            System.out.println("Position achieved by Player is: "+playerPosition);
        }
        else if(playerScore>100 && playerScore<500){
            playerPosition=3;
            System.out.println("Position achieved by Player is: "+playerPosition);
        }else {
            return -1;
        }
        return -1;
    }
}

