import java.util.Random;

public class Task8 {
    public static void main(String[] args){
        Random rand = new Random();
        int d;
        int e;
        int f;
        int counter = 0;
        int sum;
        boolean triple = false;
        System.out.println("Roll   Die1   Die2  Die3  Sum");
        System.out.println("-----------------------------");
        for (;!triple; counter++){
            d = rand.nextInt(6)+1;
            e = rand.nextInt(6)+1;
            f = rand.nextInt(6)+1;
            sum = d + e +f;
            System.out.println(counter + "       "+ d + "      "+ e + "     "+ f + "     "+ sum);
            if (d == e && e==f){
                triple = true;
            }
        }
    }
}
