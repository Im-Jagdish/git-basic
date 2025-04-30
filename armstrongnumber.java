import java.util.Scanner;

public class armstrongnumber {
    static int power(int base, int exp){
        int pow=1;
        for(int i=1;i<=exp;i++){
            pow=pow*base;
        }
        return pow;
    }
    static int count(int num){
        int count=0;
        while (num!=0) {
            count++;
            num=num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);   //armstrong number means a number which we put & power of totl number 
        System.out.println("enter a number");  //of number plus one by one putting value.
        int num=sc.nextInt();
         int temp=num;
         int exp=count(num);   //371=3^3+7^3+1^3=371
         int rem=0;           //8208=8^4+2^4+0^4+8^4=820
         int sum=0;
         while (num!=0) {
            rem=num%10;
            sum=sum+power(rem,exp);
            num=num/10;
         }
         if (temp==sum) {
            System.out.println("armstrong number");
         }
         else{
            System.out.println("not a armstrong number");
         }
    }
}
