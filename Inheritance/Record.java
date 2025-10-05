import java.util.Scanner;
public class Record {
    static String [] name;
    static int [] rnk;

    Record()
    {
        name = new String[10];
        rnk = new int[10];
    }

    static void readValues()
    {
        Scanner x = new Scanner(System.in);
        for(int i=0; i<name.length; i++)
        {
            System.out.println("Enter the name of candidate number "+(i+1));
            name[i] = x.nextLine();
            System.out.println("Enter rank: ");
            rnk[i] = x.nextInt();
            System.out.println();
        }
        x.close();
    }

    static void display()
    {
        for(int i=0; i<50; i++)
        {
            System.out.println(name[i]+" is rank number "+rnk[i]);
        }

    }
}
