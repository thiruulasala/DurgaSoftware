import java.util.ArrayList;

public class RetainAll
{
    public static void main(String[] args)
    {
        ArrayList<String> as=new ArrayList<String>();
        as.add("aaa");
        as.add("bbb");
        as.add("ccc");
        as.add("ddd");
        as.add("eee");
        as.add("fff");
        System.out.println(as);
        ArrayList<String> as1=new ArrayList<String>();
        as1.add("ccc");
        as1.add("ddd");
        as.add("eee");
        System.out.println(as1);
        System.out.println(as.retainAll(as1));
        System.out.println(as);
    }
}
