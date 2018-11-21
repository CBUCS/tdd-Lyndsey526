/*
Lyndsey Wilson
ID#684781

 */

public class BSTTest
{
    public static void main(String[] args)
    {
        int values[] = {4, 2, 6, 1, 3, 5, 7};
        int values2[] = {7, 6, 5, 4, 3, 2, 1};

        DFSBST<Integer> tree = new DFSBST<Integer>();
        for(int i = 0; i < values.length; i++)
            tree.insert(values[i]);
        tree.visit();

        BFSBST<Integer> tree2 = new BFSBST<Integer>();
        for(int i = 0; i < values.length; i++)
            tree2.insert(values[i]);
        tree2.visit();

        tree = new DFSBST<Integer>();
        for (int i = 0; i < values2.length; i++)
            tree.insert(values2[i]);
        tree.visit();

        tree2 = new BFSBST<Integer>();
        for (int i = 0; i < values2.length; i++)
            tree2.insert(values2[i]);
        tree2.visit();
    }
}
