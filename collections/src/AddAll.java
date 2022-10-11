import java.util.HashSet;

public class AddAll
{
    public static void main(String[] args)
    {
        HashSet<String> hs=new HashSet<String>();
        hs.add("aaa");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");
        HashSet<String> hs1=new HashSet<String>();
        hs1.add("aaa");
        hs1.add("bbb");
        System.out.println(hs1.addAll(hs));
    }
}
