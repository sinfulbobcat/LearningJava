public class Rank extends Record {
    static int index;
    Rank(){
        super();
        index = 0;
    }

    static void highest()
    {
        index = rnk[0];
        for(int i=0; i<10; i++)
        {
            if(rnk[i] >= index)
            index = i;
        }
        
    }

    static void display()
    {
        System.out.println("The topped is "+name[index]+" with rank "+rnk[index]);
    }

    public static void main(String[] args) {
        Rank obj = new Rank();
        readValues();
        display();

        Rank.highest();
        Rank.display();
    }
}
