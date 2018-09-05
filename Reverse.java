/*** Created by Armando Minor on 1/31/16.* **/
//*This program takes inputs and outputs them in reverse order*//

import java.util.Scanner; //Import Scanner Class
import java.util.Stack;  //Import Stack Class

public class Reverse {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //Enable for input
        double input;                        //Initialize double input
        Stack<Double> stack = new Stack<Double>(); //Create stack
        System.out.println("Input 4 numbers to be added to the stack");
        stack.push(input = in.nextDouble()); //take inputs and assign to stack
        stack.push(input = in.nextDouble());
        stack.push(input = in.nextDouble());
        stack.push(input = in.nextDouble());
        System.out.println("Reverse order:");
        
        for (int i = 0, s = stack.size(); i < s; i++)
        {
            System.out.println(stack.pop()); //output inputs in reverse order
        }
    }
}