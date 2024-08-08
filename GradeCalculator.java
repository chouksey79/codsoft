import java.util.*;
public class GradeCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of hindi:");
        double H = sc.nextDouble();
        System.out.println("enter marks of english:");
        double E = sc.nextDouble();
        System.out.println("enter marks of Maths:");
        double M = sc.nextDouble();
        System.out.println("enter marks of Science:");
        double S = sc.nextDouble();
        System.out.println("enter marks of Prog:");
        double P = sc.nextDouble();

        double total = H+E+M+S+P;
        double per = total/5;
        System.out.println("the total percentage of the student is:"+per);
        if(per>=33){
            if(per>=45){
                if(per>=75){
                    System.out.println("A Grade");
                }else{
                    System.out.println("B Grade");
                }
            }else{
                System.out.println("C Grade");
            }
        }else{
            System.out.println("failed");
    }
}
}
