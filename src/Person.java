public class Person {
    public String name;
    public int age;
    public String adress;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getAdress(){
        return adress;
    }
    public void setAdress(String adress){
        this.adress= adress;
    }

    public Person (String name, int age, String adress){
        this.name = name;
        this.age = age;
        this.adress = adress;

    }
    public void displayInfo(){
        System.out.println("Nume: " + name + "Age: " + age + " Adress: " + adress) ;
    }
    public static void main (String[] args){
        Person person1 = new Person( "Vasile" , 90, "str.Crisului 2/1");
        Person person2 = new Person( "Karmen" , 19, "str.Morilor 9");
        Person person3 = new Person( "Sorin ", 44, "str.Florilor 1");

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        person1.setAge(91);
        person2.setAdress("str.Crisului 2/2");

        System.out.println ("Dupa modificari:");
        person1.displayInfo();
        person2.displayInfo();



    }

}
