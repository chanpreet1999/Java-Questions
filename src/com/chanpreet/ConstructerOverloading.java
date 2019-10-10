public class ConstructionOverloading extends Parent{
    public static void main(String[] args) {
        Parent a=new Parent();
    Parent b=new Parent(10l);
    Parent c=new Parent('c');
    Parent d=new Parent(10);
    Parent e=new Parent(10.09f);
    
    } 
}
class Parent{
    Parent(){System.out.println("Default constructer");}
    Parent(long l){System.out.println("int arg Constructer");}
    Parent(double d){System.out.println("float arg constructer");}
}

