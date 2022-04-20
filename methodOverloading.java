public class methodOverloading {
    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New Score is: "+newScore);
//
//        calculateScore(840);

        calcFeetAndInchesToCentimeters(30, 223);
        calFeetAndInchesToCentimeters(78);
    }
    public static int calculateScore(String playername, int score){
        System.out.println("Player "+playername+" scored "+score
        +" points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored "+score+" points");
        return score*1000;
    }
    public static int calcFeetAndInchesToCentimeters(int feet, int inches){
        double FeetToCenti, InchesToCenti;
        if(feet>=0 || inches>=0 && inches<=12){
            FeetToCenti = 30.48*feet;
            InchesToCenti = 2.54 * inches;
            System.out.println(FeetToCenti+" these many cm in "+feet+" ft.");
            System.out.println(InchesToCenti+" these many cm in "+inches+" inch.");
        }
        return -1;
    }
    public static int calFeetAndInchesToCentimeters(int inches1){
        double foot1;
        if(inches1>=0){
            foot1 = 12*inches1;
            System.out.println(foot1+" ft. in "+inches1+" inches");
        }
        return -1;
    }

}
