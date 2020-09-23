public abstract class Pet {
    private String name;

    public Pet(String name){
        this.name = name;
    }

    public String speak(){
        return "This is me speaking.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
