import java.util.*;
class exercise {
    public static double exercise_one(double x, double y, double z) {
        double answer = 0;
        double add=0;
        double sub =0;
        // Enter your code here
        // Calculate the value of an expression and store the final value in the answer
        x=x*x;
        y=y*y;
        add=x+y;
        z=Math.abs(z);
        sub = add-z;
        answer=Math.cbrt(sub);
    
      
        /* You do not need to worry too much about the return statement for the 
        moment and just set the value of “answer” correctly*/
        return answer;   
    }
}
