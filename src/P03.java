public class P03 {
    public static void main(String[] args) {
        //Problem 3
        //         *
        //        * *
        //      * * *
        //    * * * *
        //  * * * * *
        for(int i=5;i>0;i--){
            for(int j=0;j<=5;j++){
                if(i<=j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
