package brightway_week_3.persons;

public class Person {
    private String name;
    private int age;
    private String adress;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void introduce(){
        System.out.println("Hello! I'm "+name+", "+age+" years old and live in "+"'"+ adress+"'");
    }

}
