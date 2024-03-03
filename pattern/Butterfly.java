package pattern;

public class Butterfly {
    public static void main(String[] args){
        for (int i=0;i<5;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            int spaces=2*(5-i);
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
