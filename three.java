public class three {
    public static void main(String [] args){
        int num=14;
        int s=0;
        while (num>0){
            if(num%2==0){
                num=num/2;
            }else{
                num=num-1;
            }
            s++;
        }
        System.out.println("Output : "+s);
    }
}
