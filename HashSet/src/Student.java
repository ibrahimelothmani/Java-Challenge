

class Student {
    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return rollNumber == student.rollNumber &&
                name.equals(student.name);
    }
    @Override
    public int hashCode() {
        return 31 * rollNumber + name.hashCode();
    }
}