import java.util.ArrayList;

public class Contains
{
    public static void main(String[] args)
    {
        ArrayList<String> aa=new ArrayList<String>();
        aa.add("aaa");
        aa.add("bbb");
        aa.add("ccc");
        aa.add("ddd");
        aa.add("eee");
        System.out.println(aa);
        System.out.println(aa.contains("bbb"));
        System.out.println(aa.contains("wwww"));
    }
}
