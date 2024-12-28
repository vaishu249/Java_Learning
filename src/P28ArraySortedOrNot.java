
 class P28ArraySortedOrNot {
     public static void main(String[] args) {
         int[] numArr=ArrayUtility.inputFromUser();
         boolean isInc=isIncreasing(numArr);
         boolean isDec=isDecreasing(numArr);
         if(isInc || isDec){
             System.out.println("Array is Sorted order....");
         }
         else{
             System.out.println("Array is unsorted...");
         }
     }
     public static boolean isIncreasing(int[] arr){
         int i=1;
         while(i<arr.length){
             if(arr[i-1]>arr[i]){
                 return false;
             }
             i++;
         }
         return true;
     }
     public static boolean isDecreasing(int[] arr){
         int i=1;
         while(i<arr.length){
             if(arr[i-1]<arr[i]){
                 return false;
             }
             i++;
         }
         return true;
     }
}
