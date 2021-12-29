import java.util.*;
public class linkedlist {
    public static void main(String[] args)
    {
        LinkedList<Integer>l1=new LinkedList<>();
        l1.add(5);
        l1.add(5);
        l1.add(5);
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
    }
}
