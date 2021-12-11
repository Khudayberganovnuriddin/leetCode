package leetCode.Arrays101.DuplicateZeros;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int consDups = 0;
        int length = arr.length-1;

        for(int i=0;i<=length-consDups;i++){
            if(arr[i] == 0){
                if(i==length - consDups){
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                consDups++;
            }
        }

        int last = length - consDups;
        for(int i=last;i>=0;i--){
            if(arr[i] == 0){
                arr[i+consDups] = 0;
                consDups--;
                arr[i+consDups] = 0;
            }else{
                arr[i+consDups] = arr[i];
            }
        }
    }
}
