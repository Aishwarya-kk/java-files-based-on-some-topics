public class linear {

    public static int linearsearch(int num[],int key){
        for(int i=0;i<num.length;i++){
  if(num[i]==key){
            return i;
        }
        }
      
        return -1;
    }
    public static void main(String args[]){
        int num[]={21,2,10,20,30};
        int key=30;
        int index =linearsearch(num,key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key is found at index:"+index);
        }
    }
}
