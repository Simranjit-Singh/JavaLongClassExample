public class A {
    public static void main(String... ar)
    {
        Long l1 = new Long("10"); //Constructor accepting String value
        Long l2 = new Long(10);  //Constructor accepting primitive int value

        System.out.println("Value in l1 = "+ l1);
        System.out.println("Value in l2 = "+ l2);

        System.out.println("Invoking l1 to compare with l2 : "+ l1.compareTo(l2));

        Long l3 = new Long("15");
        Long l4 = new Long(20);

        System.out.println("Value in l3 = "+l3);
        System.out.println("Value in l4 = "+l4);

        System.out.println("Invoking l3 to compare with l4 : "+ l3.compareTo(l4));

        System.out.println("Invoking l4 to compare with l3 : "+ l4.compareTo(l3));
    }
}