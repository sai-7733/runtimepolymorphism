class A{
    void m1(int a,int b){
        System.out.println(a+b);
    }
    void m2(String s,int a){
        System.out.println(a);
    }
}
class B extends A{
    void m1(int a,int b){
        System.out.println(a*b);
    }
    void m2(String s,int a){
        System.out.println(s);
    }
}
public class C{
    public static void main(String args[]){
        A obj = new A();
        B obj1=new B();
        obj.m1(10,20);
        obj1.m1(10,20);
        obj.m2("sai",10);
        obj1.m2("sai",20);
    }
}