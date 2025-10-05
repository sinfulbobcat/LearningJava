
public class Number {
    static int n;
    
    Number(int nn)
    {
        n = nn;
    }

    static int factorial(int n)
    {
        if(n==0) return 1;
        return n*factorial(n-1);
    }

    void display()
    {
        System.out.println("Output factorial: " + n);
    }
}
