public class Animal {

    private String name;
    private int weight;
    private String colour;


    public Animal() {
    }

    public Animal(String name, int weight, String colour) {
        this.name = name;
        this.weight = weight;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }
    public void method(){
        System.out.println("Java");
    }
}
