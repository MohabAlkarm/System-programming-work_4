/**
 * Ex1
 */
//מואב אלחרם 315059253
//סארה אלחמידי 213006018 
public class Ex1 {

    public static void main(String[] args) {
        A a = new A();
        foo(a);
        B[] b1 = new B[3];
        B b2 = new B();
        foo(b2, b1[1]);
        A b3 = new B(b2);
        a = b3;
        System.out.println(a.d1);
    }

    public static void foo(A a) {
        a = new A();
    }

    public static void foo(A a1, A a2) {
        a1 = new A();
        a2 = new B();
    }
}

class A {
    protected int x, y;
    protected Double d1, d2;

    public A() {
        d1 = new Double(3.14);
        x = y = 1;
    }
}

class B extends A {
    public B() {
        x = 2;
        y = 3;
    }

    public B(B a) {
        x += a.x;
        y += a.y;
        d1 = 5.3;
        d2 = a.d2;
    }
}
