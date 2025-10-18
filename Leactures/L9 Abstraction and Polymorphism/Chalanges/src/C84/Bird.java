package C84;

public abstract class Bird implements Flyable{

    private final String bread;

    public Bird(String bread) {
        this.bread = bread;
    }

    public String getBread() {
        return bread;
    }


}
