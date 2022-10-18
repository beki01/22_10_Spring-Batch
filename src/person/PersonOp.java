package person;

public class PersonOp {
    public void callPerson(){
        Person onePerson = new Person();
        Person two = new Person();

        onePerson.setName("Tristan");
        System.out.println(onePerson.getName());
        two.setName("Skylar");
        System.out.println(two.getName());
    }
}
