import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ScientificCalculator {

    private static final Logger logger= LogManager.getLogger(ScientificCalculator.class);

    public static void main(String[] args){
        //System.out.print("Helllo");
        Scanner scanner=new Scanner(System.in);
        ScientificCalculator scientificCalculator=new ScientificCalculator();
        int choice=0;
        boolean done=false;
        while(!done){
            System.out.print("\n------------Scientific Calculator-----------");
            System.out.print("\n1-Squareroot");
            System.out.print("\n2-Factorial");
            System.out.print("\n3-Natural Logarithm");
            System.out.print("\n4-Power function");
            System.out.print("\n5-Exit");
            System.out.print("\nEnter choice:");
            choice= scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("\nEnter a number:");
                    double number=scanner.nextDouble();
                    double sqrt=scientificCalculator.squareroot(number);
                    System.out.print("\nSquare root of "+number+" = "+sqrt);
                    break;

                case 2:
                    System.out.print("\nEnter integer number:");
                    int num=scanner.nextInt();
                    int factorial= scientificCalculator.factorial(num);
                    System.out.print("\nFactorial of "+num+" = "+factorial);
                    break;

                case 3:
                    System.out.print("\nEnter a number:");
                    double num1=scanner.nextDouble();
                    double log=scientificCalculator.naturalLog(num1);
                    System.out.print("\nNatural log of "+num1+" = "+log);
                    break;

                case 4:
                    System.out.print("\nEnter a number:");
                    double num2=scanner.nextDouble();
                    System.out.print("\nEnter the power:");
                    double num3=scanner.nextDouble();
                    double power=scientificCalculator.power(num2,num3);
                    System.out.print("\n "+num2+" to the power of "+num3+" = "+power);
                    break;

                case 5:
                    System.out.print("\nExiting......");
                    done=true;
                    break;
            }
        }

    }

    public double squareroot(double number){
        logger.info("[SQUARE ROOT] - "+number);
        logger.info("[RESULT SQUARE ROOT] - "+Math.sqrt(number));
        return Math.sqrt(number);
    }

    public int factorial(int number){
        logger.info("[FACTORIAL] - "+number);
        int fact=1;
        while(number>0){
            fact=fact*number;
            number--;
        }
        logger.info("[RESULT FACTORIAL] - "+fact);
        return fact;
    }

    public double naturalLog(double number){
        logger.info("[NATURAL LOG] - "+number);
        logger.info("[RESULT NATURAL LOG] - "+Math.log(number));
        return Math.log(number);
    }

    public double power(double number,double pow){
        logger.info("[POWER FUNCTION] - "+number+"^"+pow);
        logger.info("[RESULT POWER FUNCTION] - "+Math.pow(number,pow));
        return Math.pow(number,pow);
    }
}