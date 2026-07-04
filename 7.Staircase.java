class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
   for (int i=1;i<=n;i++){
    for(int k=n-1;k>=i;k--){
         System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("#");
    }
     System.out.println();
   }

    }

}
