/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe;

import java.util.Random;
import java.util.Scanner;

public class POE {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws NoMatchException {
        //findMin(20, 30);
        //generateRandNums(100);
        //simpleInt();
        //calcSum(123456);
        //genRoman();
        
        /*System.out.print("Enter the word Symbiosis: ");
        String word = in.next();
        checkString(word);
        
        System.out.println("Enter a number to view its reverse:");
        double num = in.nextDouble();
        reverseOfNum(num);*/
        
        System.out.println("Enter a phrase to get its Length:");
        String phrase = in.nextLine();
        System.out.println("Phrase: "+phrase+" has " + phrase.length()+" Characters.");
    }
    
    public static void findMin(double num1, double num2)
    {
        double minNum;
        if(num1 <= num2){
            minNum = num1;
        }
        else{
            minNum = num2;
        }
        System.out.println("Minimum number is: " + minNum);
    }
    
    public static void generateRandNums(int range)
    {
        Random rndNum = new Random();
        int rndIntNum;
        for (int i = 0; i < 5; i++) {
            rndIntNum = rndNum.nextInt(range);
            System.out.println("Random Number " + (i+1) + ": " + rndIntNum);
        }
    }
    
    public static void simpleInt(){
        double valP, valN, valR, interest;
        System.out.println("Calculating Simple Interest");
        System.out.print("Enter P value: ");
        valP = in.nextDouble();
        System.out.print("Enter N value: ");
        valN = in.nextDouble();
        System.out.print("Enter R value: ");
        valR = in.nextDouble();
        interest = (valP*valN*valR)/100;
        System.out.println("Simple Interest Value: " + interest);
    }
    
    public static void calcSum(int num){
        int calcVal = 0;
        for (int i = 0; i < String.valueOf(num).length(); i++) 
        {
            calcVal += Integer.parseInt(Character.toString(String.valueOf(num).charAt(i)));
        }
        System.out.println("Sum of "+num+" is: "+calcVal);
        
    }
    
    public static void genRoman()
    {
       int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
       String[] romValues = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
       StringBuilder genValue = new StringBuilder();
       StringBuilder genValueAfter = new StringBuilder();
       double userNum, origVal;
       int indx, numAfter;
       String txtAfter;
       
       System.out.print("Enter number to convert:");
       userNum = in.nextDouble();
       origVal = userNum;
       //Number after comma
       indx = String.valueOf(userNum).indexOf(".");
       txtAfter = String.valueOf(userNum).substring(indx+1);
       numAfter = Integer.parseInt(txtAfter);
       
       for(int i = 0; i < romValues.length; i++) 
       {
           while(userNum >= values[i])
           {
               userNum -= values[i];
               genValue.append(romValues[i]);
           }
           //Dealing with number after comma
           while(numAfter >= values[i])
           {
               numAfter -= values[i];
               genValueAfter.append(romValues[i]);
           }
       }
        System.out.println(origVal+" is Equivalent to this Roman Figure: " + genValue.append("."+genValueAfter));
    }
    
    public static void checkString(String val) throws NoMatchException
    {
        try 
        {
            if (!val.contains("Symbiosis")) {
            throw new NoMatchException("Error! The word entered is not Equal to Symbiosis!");
            }
            else{
                System.out.println("Thank You! The Word entered is Equal to Symbiosis.");
            }
        } catch (NoMatchException e) 
        {
            System.err.println(e.getMessage());
        }
    }
    
    public static void reverseOfNum(double userNum)
    {
        String strNum = String.valueOf(userNum);
        //Getting rid of the .0 if user entered an integer number
        if(strNum.contains(".0")){
            strNum = strNum.substring(0, strNum.indexOf("."));
        }
        //Reversing the final number
        System.out.print("Reverse of Number: " + strNum+" is: ");
        for (int i = strNum.length() - 1; i >= 0; i--) {
            System.out.print(strNum.charAt(i));   
        }
    }
}
