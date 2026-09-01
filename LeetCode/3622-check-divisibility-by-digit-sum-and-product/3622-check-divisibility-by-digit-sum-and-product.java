class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
       int  digitsum=0,digitProduct=1;
       while(n!=0){
        int dig=n%10;
        digitsum+=dig;
       digitProduct*=dig;
       n=n/10;
       }
       if(num%(digitsum+digitProduct)==0)
       return true;
       else{
        return false;
       }
    }
}