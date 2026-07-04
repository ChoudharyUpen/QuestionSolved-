class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
   //for apple 
   int count=0;
   int bcount=0;
   for(int i=0;i<apples.size();i++){
    int sum=apples.get(i)+a;
    if(sum >= s && sum <=t){
        count++;
       
    }
   }
//for orange 
for(int j=0;j<oranges.size();j++){
    int sum=oranges.get(j)+b;
    if(sum >= s && sum <=t){
        bcount++; 
    }
   }
   System.out.println(count);
   System.out.print(bcount);
    }

}
