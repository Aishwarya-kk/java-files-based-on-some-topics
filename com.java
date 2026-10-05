public class com {
    public static void main(String args[]){
       String str1="AISHWARYA";
       String str2="AISHWARYA";
       System.out.println(str1.compareTo(str2));
       String fruit[]={"Mango","Apple","Banana"};
       String large=fruit[0];
       for(int i=1;i<fruit.length;i++){
        if(large.compareTo(fruit[i])<0){
            large=fruit[i];
        }

       }
       System.out.println("Largest fruit is: "+large);
          StringBuilder sb=new StringBuilder("AISHWARYA");
    System.out.println(sb.toString());
    Integer a=10;
    System.out.println(a.toString());
String str9="Hi Aishwarya";
System.out.println(str9.toUpperCase());
System.out.println(str9.toLowerCase());
    }
    
 
}
