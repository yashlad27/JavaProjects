public class overridingEx {
    public void bark(){
        System.out.println("woof");
    }
}
class GermanShepard extends overridingEx{
    @Override
    public void bark(){
        System.out.println("woof woof woof");
    }
}