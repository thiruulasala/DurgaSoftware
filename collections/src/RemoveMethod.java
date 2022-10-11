import java.util.ArrayList;

public class RemoveMethod
{
    public static void main(String[] args)
    {
        ArrayList<String> a1=new ArrayList<String>();
        a1.add("aaa");
        a1.add("bbb");
        a1.add("ccc");
        a1.add("ddd");
        a1.add("eee");
        System.out.println(a1);
        System.out.println(a1.remove("bbb"));
        System.out.println(a1);
        System.out.println(a1.remove("zzz"));
    }
}
