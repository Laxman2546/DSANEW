package oops;

public  class StudentDet implements Student{
    private String name;
    private int age;

    @Override
    public void name(String name) {
        this.name=name;
        System.out.println(name);
    }

    @Override
    public void age(int age) {
        this.age = age;
        System.out.println(age);
    }

}

