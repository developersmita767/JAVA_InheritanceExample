class Parent{
    int a=10;
    int b=20;
   
    void parentMethod(){
        System.out.println("Inside the parent method");
    }

}
class Child extends Parent{
    int b=30;
    
}
class GrandChild extends Child{
    int c=50;
}
public class TestInheritance{
    public static void main(String[] ar){
        /*Child child=new Child();
        System.out.println("Value of property a of child="+child.a);
         System.out.println("Value of property b of child="+child.b);
          child.parentMethod();*/
         GrandChild gChild=new GrandChild();
        System.out.println("Value of property a of GrandChild="+gChild.a);
         System.out.println("Value of property b of GrandChild="+gChild.b);
         System.out.println("Value of property c of GrandChild="+gChild.c);
    }
}