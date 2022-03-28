package singleton;

public class Main {
    /*chỉ duy nhất một thể hiện (instance) được tạo ra và nó sẽ cung cấp cho bạn một method để có thể truy xuất được 
    thể hiện duy nhất đó mọi lúc mọi nơi trong chương trình. */
    private static Person person = Person.getInstance();
    public static void main(String[] args) {
        
        
        person.setId("1");
        person.setName("name");
        System.out.println(person.toString());

        newPerson();
    }
    private static void newPerson() {
        person.setId("33");
        person.setName("aaaa");
        System.out.println(person.toString());
    }
}
