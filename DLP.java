import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class DLP{
    public static void main(String[] args){
        ArrayList<Character> nameSB = new ArrayList<>(Arrays.asList(new Character[]{'s', 'p', 'd', 'f'}));
        int[] valueSB = {2,6,10,14};
        String paulling = "1s2s2p3s3p4s3d4p5s4d5p6s4f5d6p7s5f6d7p";
        
        System.out.println("digite o número Z do átomo.:");

        Scanner s = new Scanner(System.in);

        int z = s.nextInt();
        System.out.println("Sub-níveis.:\tElétrons.:");
        while(z > 0){
            
            for(int i = 0; i<paulling.length(); i+=2){
                int subnivel = valueSB[nameSB.indexOf(paulling.charAt(i+1))];
                System.out.print(paulling.charAt(i)+""+paulling.charAt(i+1) + "  \t\t");
                if(z > subnivel){
                    z-=subnivel;
                    System.out.println(subnivel);
                }
                else{
                    System.out.println(z);
                    System.exit(0);
                }
            }
        }
    }

}