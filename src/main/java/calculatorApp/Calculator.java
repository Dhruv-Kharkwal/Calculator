package calculatorApp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    private static double inp;
    public  Calculator(){

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Operations obj = new Operations();
        int option;
        System.out.println("-----------------------------------CALCULATOR--------------------------------------------");

        while(true){
            obj.menu();

            option=sc.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("Enter a number: ");
                    double val = sc.nextDouble();
                    double res = obj.sqrt(val);
                    logger.info("Square root function ");
                    if (res == -1) {
                        System.out.println("Square root of negative number cannot be calculated");
                        logger.error("Square root of negative number cannot be calculated");
                    }else if(res == -2){
                        System.out.println("Input type mismatch");
                        logger.error("Input type mismatch");
                    }
                    else {
                        System.out.println("Square root of " + val + ": " + res);
                        logger.info("Square root of " + val + ": " + res);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter a number: ");
                    double val = sc.nextDouble();
                    double res = obj.factorial(val);
                    logger.info("Factorial function");
                    if(res==-1){
                        System.out.println("Factorial of negative number cannot be calculated");
                        logger.error("Factorial of negative number cannot be calculated");
                    }else if(res == -2){
                        System.out.println("Input type mismatch");
                        logger.error("Input type mismatch");
                    }
                    else{
                        System.out.println("Factorial of "+val+": "+res);
                        logger.info("Factorial of "+val+": "+res);
                    }
                    break;
                }
                case 3:{
                    System.out.println("Enter a number: ");
                    double val=sc.nextDouble();
                    double res=obj.logarithm(val);
                    logger.info("Logarithm function");
                    if(res==-1){
                        System.out.println("Logarithm cannot be calculated for given number (negative number or 0)");
                        logger.error("Logarithm cannot be calculated for given number (negative number or 0)");
                    }else if(res == -2){
                        System.out.println("Input type mismatch");
                        logger.error("Input type mismatch");
                    }else{
                        System.out.println("Logarithm of "+val+": "+res);
                        logger.info("Logarithm of "+val+": "+res);
                    }
                    break;
                }
                case 4:{
                    System.out.println("Enter first number:");
                    double val1=sc.nextDouble();
                    System.out.println("Enter second number:");
                    double val2=sc.nextDouble();
                    logger.info("Power function");
                    double res=obj.power(val1,val2);
                    if(res==-2){
                        System.out.println("Enter correct numbers. Input type mismatch");
                        logger.error("Enter correct numbers. Input type mismatch");
                    }else{
                        System.out.println(val1+" to the Power of "+val2+": "+res);
                        logger.info(val1+" to the Power of "+val2+": "+res);
                    }
                    break;
                }
                case 5:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Enter correct option");
            }
        }
    }
}
