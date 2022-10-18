import FirstHelloWorld.HelloWorld;
import person.PersonOp;

public class Operator {
    static HelloWorld world = new HelloWorld();
    static PersonOp persons = new PersonOp();

    public static void main(String[] args){
        world.greet();
        world.goodbye();

        persons.callPerson();
    }
}
