import java.util.Random;

public class Task8 {
    public static void main(String[] args){
        Random rand = new Random();
        int d = rand.nextInt(1, 6);
        int e = rand.nextInt(1, 6);
        int f = rand.nextInt(1, 6);
        int counter = 0;
        System.out.println("Roll Die 1, Die 2 and Die 3");
        for (d == e ==f){
            counter++;
            System.out.printf(counter + "   "+ d + "  "+ e + "  "+ f + "  "+ (d+e+f));
        }
    }
}
