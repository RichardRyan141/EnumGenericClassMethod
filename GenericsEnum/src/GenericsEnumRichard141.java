public class GenericsEnumRichard141 {
    public static <T> boolean isEqual(GenericClass<T> a, GenericClass<T> b)
    {
        return a.getData().equals(b.getData());
    }

    public static void main(String[] args) {
        GenericClass<Integer> a = new GenericClass<>(141);
        System.out.println("Generic class integer (a) : " + a.getData());

        GenericClass<String> b = new GenericClass<>("Richard");
        System.out.println("Generic class string (b) : " + b.getData());

        GenericClass<String> c = new GenericClass<>("Ryan");
        System.out.println("Generic class string (c) : " + c.getData());

        System.out.println();

        if (isEqual(b,c))
        {
            System.out.println("Data in b = Data in c");
        }
        else
        {
            System.out.println("Data in b =/= Data in c");
        }

        System.out.println();

        for (Season s : Season.values())
        {
            System.out.println(s);
        }

    }
}