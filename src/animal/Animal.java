package animal;

public class Animal {

//    フィールド
    private String name;
    private int age;

//    コンストラクタ
    public Animal() {

    }
//    引数ありのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

        public void say() {
            System.out.println(name + "です。" + age + "歳です。");
        }

//    setter / getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
