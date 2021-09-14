package com.avi;

public class geeklarge {
    public static void main(String[] args) {
        int[] array = {2,34,5,55,5,5,43,3,32,3,4,4,};

        int max = array[0];

        for (int i = 0; i< array.length; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("The largest number is "+max);

    }
}
