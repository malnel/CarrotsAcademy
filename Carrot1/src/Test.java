public class Test {

    int value;

    public int changeValue (int a) {
        a = 10;
        return a;
    }

    public void reallyChangeValue(Test t) {
        t.value = 10;
    }

    public static void main(String[] args) {

        Test t = new Test();

        int a = 5;
        System.out.println(a);
        t.changeValue(a);
        System.out.println(a);

        t.value = 3;
        System.out.println(t.value);
        t.reallyChangeValue(t);
        System.out.println(t.value);
    }
}


