public class SymbolGrammer{
    private static int  kthGrammar(int n, int k) {
        if (n==1){
            return 0;
        }
        int parent=kthGrammar(n-1,(int) Math.ceil(k/2.0));
        boolean isOdd= k%2==1;
        if (parent==0) {
            return isOdd ? 0:1;
        }
        else{
            return isOdd? 1 :0;
        }
    }
    public static void main(String []args){
       int res=kthGrammar(4,4);
       System.out.println(res);
        int res1=kthGrammar(1,1);
        int res2=kthGrammar(3,3);
        System.out.println(res1);
        System.out.println(res2);
    }
}
