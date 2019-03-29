import java.util.Scanner;
import java.lang.String;
public class Main{

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Which President won the election in the United States in 2018?");
    System.out.println("1 - Klinton \n2 - Thramp");
    int a = scn.nextInt();
    if(a==1){
        System.out.println("You're wrong!");
    }else{
        System.out.println("You're right!");
    }

    Scanner scn2 = new Scanner(System.in);
    System.out.println("How old are you? ");
    System.out.println("1 - <18 \n2 - 18+");
        int b = scn2.nextInt();
        if(b==1) {
            System.out.println("You so small! ");
        }else {
                System.out.println("You realy student! ");
        }

        }

    }

