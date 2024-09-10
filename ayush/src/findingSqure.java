public class findingSqure {
    public static void main(String[]args){

         int num  = findS(15);
        System.out.println(num);
    }
    static int findS(int n){
        int ans = 0;
        while (n>0){
            int  rem = n%10;
            ans+= rem*rem;
            n/=10;
        }
        return ans;
    }
}
