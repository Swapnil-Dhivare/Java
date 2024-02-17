public class sumandproductdifference{
    public static void main(String[] args) {
        int n = 234;
        int rem,prod=1,sum=0;
        while(n!=0)
        {
            rem=n%10;
            prod=prod*rem;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(prod - sum );

    }
}