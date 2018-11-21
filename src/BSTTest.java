/*
Lyndsey Wilson
ID#684781

 */

public class BSTTest
{
    public static void main(String[] args)
    {
        DFSBST<Integer> tree = new DFSBST<Integer>();
        int values[] = {4, 2, 6, 1, 3, 5, 7};
        for(int i = 0; i < values.length; i++)
            tree.insert(values[i]);
        tree.visit();

        BFSBST<Integer> tree2 = new BFSBST<Integer>();
        for(int i = 0; i < values.length; i++)
            tree2.insert(values[i]);
        tree2.visit();
    }
}