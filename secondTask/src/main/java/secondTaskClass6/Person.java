package secondTaskClass6;

import java.util.ArrayList;

public class Person {
    private String name;

    private String lastname;

    private final String[] names = {"Fernando", "Lautaro", "Lucas", "Gianfranco", "Luciana"};

    private final String[] lastnames = {"Sacco", "Cruz", "Rondon", "Kim", "Cipriano"};

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }


    public Person() {
        this.name = getRandomItem(names);
        this.lastname = getRandomItem(lastnames);
    }

    private String getRandomItem (String[] list){
        int randomIndex = (int) Math.round(Math.random() * (list.length - 1) );
        return list[randomIndex];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;

        if (!name.equals(person.name)) return false;
        return lastname.equals(person.lastname);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + lastname.hashCode();
        return result;
    }

    public static ArrayList<Person> sortPersons (ArrayList<Person> list, String sortBy){
        switch (sortBy) {
            case "name" -> list.sort((o1, o2) -> o1.getName().compareTo(o2.getName() ));
            case "lastname" -> list.sort((o1, o2) -> o1.getLastname().compareTo(o2.getLastname()));
            default ->{
            }
        }
        return list;
    }
}
