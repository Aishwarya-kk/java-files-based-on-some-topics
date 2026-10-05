public class palin{

    public static boolean palindrome(String str){
        for(int i=0;i<=str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.print("is not a plaindrome");
                return false;
            }
        }
        System.out.print("is a palindrome");
        return true;
    }
    public static void main(String args[]){
        String str="AISHWARYA";
        palindrome(str);
    }
}