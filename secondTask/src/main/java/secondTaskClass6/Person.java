package secondTaskClass6;

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
}
