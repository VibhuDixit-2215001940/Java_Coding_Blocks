public class Jewel {
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int[] arr1 = new int[jewels.length()];
        int[] arr2 = new int[stones.length()];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = jewels.charAt(i);
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i] = stones.charAt(i);
        }
        int res = 0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    res++;
                }
            }
        }
        return res;
    }
}
