import java.util.Scanner;

public class Purchase extends Stock {
    static int pqty;
    static double prate;
    static double pamt;

    Purchase(int pp, double prpr, int x, double y, double z, String w)
    {
        super(w,x,y,z);
        pqty = pp;
        prate = prpr;

    }

    static void update()
    {
        qty += pqty;
        rate = prate;
        amt = qty * prate;
    }

    static void display()
    {
        System.out.println("Name: "+item+" Quantity: "+qty+" Amount: "+amt+" Rate: "+rate);

    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);


        int newprate = x.nextInt();
        double newpr = x.nextDouble();
        int xx = x.nextInt();
        double yy = x.nextDouble();
        double zz = x.nextDouble();
        String ww = x.next();


        Purchase obj = new Purchase(newprate, newpr, xx, yy, zz, ww);
        Stock.display();
        update();
        Purchase.display();

    }
}
