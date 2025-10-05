import java.util.Scanner;

public class Series extends Number {
    int sum;

    Series(int nnn)
    {
        super(nnn);
        sum = 0;
    }

    void calsum()
    {
        
        for(int i=1; i<=n; i++)
        {
            sum+=factorial(i);
        }

    }
    void display()
    {
        System.out.println("Sum of the series:  " + sum);
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter n");
        int l = x.nextInt();
        Series obj = new Series(l);

        obj.calsum();
        obj.display();
    }
}
