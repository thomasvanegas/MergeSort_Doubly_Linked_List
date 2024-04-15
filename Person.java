class Person implements Comparable<Person> {

    private String nombres;
    private String apellidos;

    public Person(String n, String a) {
        nombres = n;
        apellidos = a;
    }

    public String toString() {
        return nombres + " " + apellidos;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

}