class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
   int max=0;
   int count=0;
   
   for(int i=0;i<candles.size();i++){
    if(candles.get(i)>max){
        max=candles.get(i);
        count=1;
    }
    else if(candles.get(i) == max){
        count++;
    }
   }
    return count;
    }

}
