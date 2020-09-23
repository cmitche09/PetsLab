public class Cat extends Pet implements IGreet{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Meow Meow";
    }

    @Override
    public void greeting() {
        System.out.println("Purs and rubs against legs");
    }
}
