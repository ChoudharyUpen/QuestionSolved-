class Result {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
      int sum=0;
      for(int i=0;i<bill.size();i++){
        if(i!=k){
            sum+=bill.get(i);
        }
      }
      
      int actual=sum/2;
      if(b > actual){
        System.out.print(b-actual);
      }
      else if(b == actual){
        System.out.print("Bon Appetit");
      }

    }

}
