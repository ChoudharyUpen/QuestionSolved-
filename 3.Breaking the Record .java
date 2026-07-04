class Result {

    public static List<Integer> breakingRecords(List<Integer> scores) {
    int max=scores.get(0);
    int min=scores.get(0);
    int count=0;
    int bcount=0;
    List<Integer> arr=new ArrayList<>();
    
    for(int i=1;i<scores.size();i++){
        if(max < scores.get(i)){
            count++;
            max=scores.get(i);
        }
        if(min > scores.get(i)){
             bcount++;
            min=scores.get(i);
        }
    }
    arr.add(count);
    arr.add(bcount);
    return arr;

    }

}
