package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(doCalculation("1+1*5/3-2"));
    }

   public static String doCalculation(String stringNumbers){
       String[] numbers = stringNumbers.split("[-+*/]");
       //String[] Operators = stringNumbers.split("[0-9.]*");
       String[] Operators = Arrays.stream(stringNumbers.split("[0-9.]"))
               .filter(str -> !str.equals(""))
               .toArray(String[]::new);

       List<Double> numberList = new ArrayList<Double>();
       List<String> operatorList = new ArrayList<String>();
        for(String number: numbers){
            double no = Double.parseDouble(number);
            numberList.add(no);
        }
       for(String operator: Operators){
           operatorList.add(operator);
       }
       //numberList.forEach(System.out::println);
       //operatorList.forEach(System.out::println);
       //Do ALL Division
       for (int i=0; i<operatorList.size();i++ ) {

           switch (operatorList.get(i)){
               case "/":
                double num1 = Double.valueOf(numberList.get(i));
                double num2 = Double.valueOf(numberList.get(i+1));
                numberList.set(i,(num1/num2));
                numberList.remove(i+1);
                //System.out.println(numberList);
                operatorList.remove(i);

                //System.out.println(operatorList);
                //System.out.println(operatorList.size());
                if(operatorList.size()==0){
                    return String.valueOf(numberList.get(i));
                }
                i--;
           }
       }
       //Do All multiplication
       for (int i=0; i<operatorList.size();i++ ) {

           switch (operatorList.get(i)){
               case "*":
                   double num1 = Double.valueOf(numberList.get(i));
                   double num2 = Double.valueOf(numberList.get(i+1));
                   numberList.set(i,(num1*num2));
                   numberList.remove(i+1);
                   //System.out.println(numberList);
                   operatorList.remove(i);

                   //System.out.println(operatorList);
                   //System.out.println(operatorList.size());
                   if(operatorList.size()==0){
                       return String.valueOf(numberList.get(i));
                   }
                   i--;
           }
       }
       //Do all Addition
       for (int i=0; i<operatorList.size();i++ ) {

           switch (operatorList.get(i)){
               case "+":
                   double num1 = Double.valueOf(numberList.get(i));
                   double num2 = Double.valueOf(numberList.get(i+1));
                   numberList.set(i,(num1+num2));
                   numberList.remove(i+1);
                   //System.out.println(numberList);
                   operatorList.remove(i);

                   //System.out.println(operatorList);
                   //System.out.println(operatorList.size());
                   if(operatorList.size()==0){
                       return String.valueOf(numberList.get(i));
                   }
                   i--;
           }
       }
       //Do all Substraction
       for (int i=0; i<operatorList.size();i++ ) {

           switch (operatorList.get(i)){
               case "-":
                   double num1 = Double.valueOf(numberList.get(i));
                   double num2 = Double.valueOf(numberList.get(i+1));
                   numberList.set(i,(num1-num2));
                   numberList.remove(i+1);
                   //System.out.println(numberList);
                   operatorList.remove(i);

                   //System.out.println(operatorList);
                   //System.out.println(operatorList.size());
                   if(operatorList.size()==0){
                       return String.valueOf(numberList.get(i));
                   }
                   i--;
           }
       }
       return "calculation failed";
   }

}
