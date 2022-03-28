package singleton-java;

public class Person {
    private static Person _Person;
    private String name;
    private String id;

    private Person(){

    }

    public static Person getInstance(){
        if(_Person == null){
            _Person = new Person();
        }
        return _Person;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.name;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
