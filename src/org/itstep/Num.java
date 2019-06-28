package org.itstep;

public class Num {

    public static int  Sum(int num){

        int sum = 0;
        while (num%10!= 0){
            int k = num%10;
            num = (int)num/10;
            sum = sum + k;
        }
        System.out.println("sum =" + sum);
        return sum;
    }

    public static int SumStr(int num){
        String number = Integer.toString(num);
        char[] charArray = number.toCharArray();
        int sum = 0;
        for(int i = 0;1<charArray.length; i++){
            int c = Character.getNumericValue(charArray[1]);
            sum = sum+c;
        }
        System.out.println("sunStr =" + sum);
        return sum;
    }

}
