public class seven {
    public static void main(String[]  args){
        String s="Hello World";
        int l = s.length();
        int c=0;
        for(int i=l-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                c++;
            }else{
                break;
            }
        }
        System.out.println(c);
    }
}
