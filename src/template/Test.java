package template;

public class Test implements Chat {

    private String name;
    private int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Test t = new Test("asd", 18);
        t.say("妈妈");
    }
}
