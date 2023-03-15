package calculatorApp;

import java.util.InputMismatchException;

public class Operations {
    public void menu(){
        System.out.println("MENU");
        System.out.println("Choose one from below options: ");
        System.out.println("1. Square root Function");
        System.out.println("2. Factorial function");
        System.out.println("3. Logarithm function");
        System.out.println("4. Power function");
        System.out.println("5. Exit");
        System.out.println("Enter : ");
    }
    public double sqrt(double val) {
        try {
            double res;
            if (val < 0) {
                return -1;
            } else {
                res = Math.sqrt(val);
                return res;
            }
        }catch (InputMismatchException e){
            return -2;
        }
    }

    public double factorial(double val){
        try{
            if(val<0) return -1;
            double res=1;
            while(val!=0)
            {
                res=res*val;
                val--;
            }
            return res;
        }catch (InputMismatchException e){
            return -2;
        }
    }

    public double logarithm(double val){
        try{
            if (val<=0) return -1;
            double res= Math.log(val);
            return res;
        }catch (InputMismatchException e){
            return -2;
        }
    }

    public double power(double val1, double val2){
        try {
            double res = Math.pow(val1, val2);
            return res;
        }catch (InputMismatchException e){
            return -2;
        }

    }
}
