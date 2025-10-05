public class Stock {
    static String item;
    static int qty;
    static double rate, amt;

    Stock(String one, int two, double three, double four)
    {
        item = one;
        qty = two;
        amt = three;
        rate = four;
    }  

    static void display()
    {
        System.out.println("Name: "+item+" Quantity: "+qty+" Amount: "+amt+" Rate: "+rate);
    }
}
