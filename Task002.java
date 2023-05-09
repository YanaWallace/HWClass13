package HWClass13;

import HWClass14.Task001;

public class Task002 {
    boolean isPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }

    public static void main(String[] args) {
        Task002 task1=new Task002();
        boolean result=task1.isPalindrome("Abba");
        System.out.println(result);
    }
}
