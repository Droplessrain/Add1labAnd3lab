package main;

public class Binary {

    public static int binarySearch(int[] array, int findedNumber){
        int result = -1;
        int low = 0, hight = array.length-1;
        int mid;
        while(low<=hight){
            mid = low + (hight - low)/2;
            if(array[mid] > findedNumber){
                hight = mid-1;
            }else if(array[mid] < findedNumber){
                low = mid+1;
            }else if(array[mid] == findedNumber){
                result = mid;
                break;
            }
        }
        return result;
    }
}
