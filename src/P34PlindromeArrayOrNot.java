public class P34PlindromeArrayOrNot {
    public boolean palindrome(int[] arr){
        int i=0;
        while(i<arr.length/2){
            if(arr[i]!=arr[arr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        P34PlindromeArrayOrNot p=new P34PlindromeArrayOrNot();
        int[] arr=ArrayUtility.inputFromUser();
        if(p.palindrome(arr)){
            System.out.println("Array is palindrome...");
        }
        else{
            System.out.println("Array is not palindrome...");
        }
    }
}
