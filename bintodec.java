public class bintodec{

    public static void bin(int binNum){
        int mynum=binNum;
        int pow=0;
        int decnum=0;
        while(binNum>0){
            int lastdigit=binNum%10;
            decnum =decnum+lastdigit*(int)Math.pow(2,pow);
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal number of"+mynum+"is"+" "+decnum);
    }
    public static void main(String args[]){
        bin(11);

    }
}