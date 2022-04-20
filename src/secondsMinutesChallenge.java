public class secondsMinutesChallenge {
    public static int getDurationString(int minutes, int seconds){
        if(minutes>=0 || seconds>=0 && seconds<=59){
            int h=0,m=0,s=0;
            h = minutes/60;
            m = minutes%60;
            System.out.println(h+" hrs "+m+" mins "+seconds+" secs");

        }else{
            System.out.println("Invalid Value");
        }
        return -1;
    }
    public static int getDurationString(int seconds){
            if(seconds>=0){
                int mins;
                mins = seconds / 60;
                int remainingSec = seconds%60;

            }else{
                System.out.println("Invalid Value");
            }
        return -1;
    }
    public static void main(String[] args) {
        getDurationString(609099090, 59);
        getDurationString(49);
    }
}
