import java.util.ArrayList;

public class RemoveAllMethod
{
    public static void main(String[] args)
    {
        ArrayList<String> AL=new ArrayList<String>();
        AL.add("aaa");
        AL.add("bbb");
        AL.add("ccc");
        AL.add("ddd");
        AL.add("eee");
        AL.add("fff");
        System.out.println(AL);
        ArrayList<String> Al=new ArrayList<String>();
        Al.add("ccc");
        Al.add("ddd");
        Al.add("xxx");
        Al.add("yyy");
        System.out.println(Al.removeAll(AL));
        System.out.println(Al);
    }
}
