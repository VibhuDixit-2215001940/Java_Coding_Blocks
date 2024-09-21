public class CompressesString {
    public static void main(String[] args) {
        String str = "aaabbccc";
        int count = 1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                System.out.print(str.charAt(i));
                if(count > 1){
                    System.out.print(count);
                    count = 1;
                }
            }
        }
        System.out.print(str.charAt(str.length() - 1));
        if (count > 1) {
            System.out.print(count);
        }
    }
}


