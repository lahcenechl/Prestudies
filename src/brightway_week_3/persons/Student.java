package brightway_week_3.persons;

public class Student extends Person {

    private String joke;

    public Student(String joke) {
        this.joke = joke;
    }

    public Student(String name,int age,String adress){
        super.setAge(age);
        super.setName(name);
        super.setAdress(adress);



    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }


    protected void tellJoke(){

        System.out.println(joke);

    }
    @Override
    public void introduce() {
        super.introduce(); // Call introduce method of superclass (Person)
    }


}
