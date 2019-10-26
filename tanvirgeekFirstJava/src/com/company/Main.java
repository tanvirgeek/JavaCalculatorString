package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static String screenText = new String("123+34-23*23/2");
    public static void main(String[] args) {
        /*System.out.println(Pattern.matches("....s","safasss"));
        System.out.println(Pattern.matches(".","a"));
        System.out.println(Pattern.matches("[^abc]","t"));// One character other than abc
        System.out.println(Pattern.matches("[a-zA-Z]","a"));
        System.out.println(Pattern.matches("",""));
*/
        //String[] numbers = screenText.split("[+\\-*/]");
        /*for(String x: numbers){
            System.out.println(x);
            System.out.println("\n");
        }*/
        System.out.println(doCalculation("1+2"));

    }

   /* public static String doCaclculation(String stringNumbers){
        List<String> numbers = new ArrayList<String>();
        List<String> Operators = new ArrayList<String>();
        String result = "0";
        for(int n=0; n<stringNumbers.length();n++){
            char c = stringNumbers.charAt(n);
            if(c == '+' || c == '-' || c == '*' || c == '/'){

            }

        }
        return result;
    }*/
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
       numberList.forEach(System.out::println);
       operatorList.forEach(System.out::println);
       for (int i=0; i<operatorList.size();i++ ) {
           //System.out.println(operatorList.get(i));
           switch (operatorList.get(i)){
               case "+":
                double num1 = Double.valueOf(numberList.get(i));
                double num2 = Double.valueOf(numberList.get(i+1));
                return String.valueOf(num1+num2);
           }
       }
       return "tanvir";
   }

}
