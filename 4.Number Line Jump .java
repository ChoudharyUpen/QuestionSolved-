class Result {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
     int b=x1+v1;
        int c=x2+v2;
    for(int i=0;i<=10000;i++){
        if(b == c){
            return "YES";
        }
        b +=v1;
        c +=v2;
    }
 return "NO";
    }

}
