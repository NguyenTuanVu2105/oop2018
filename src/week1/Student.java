package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;
    // TODO: khai báo các phương thức getter, setter cho Student

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        this.name   = "Student";
        this.id     = "000";
        this.group  = "INT22041";
        this.email  = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.name   = n;
        this.id     = sid;
        this.email  = em;
        this.group  = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name   = s.getName();
        this.id     = s.getId();
        this.group  = s.getGroup();
        this.email  = s.getEmail();
    }

    void getInfo() {
        // TODO:
        System.out.println( name + " \t" +
                            id + " \t" +
                            group + " \t" +
                            email + " \t");
    }

}
