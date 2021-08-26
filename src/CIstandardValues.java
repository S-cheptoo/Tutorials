class CompoundIntrest
{
    public static void main(String args[])
    {

        double amount=0,principal=1000,rate=10,time=3,ci;

        System.out.println("principal= "+principal);

        System.out.println("rate="+rate);

        System.out.println("time="+time);

        amount=principal*((1+rate/100)*(1+rate/100)*(1+rate/100));

        System.out.println("amount="+amount);

        ci=amount-principal;

        System.out.println("compound interest="+ci);

    }
}
