package week2.task3;

public class Task3 {

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

    public class Dog {
        // Thuộc tính
        int age;
        String nameOfMaster;
        String colorOfHair = "Black"; //Màu lông

        //getter and setter
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getNameOfMaster() {
            return nameOfMaster;
        }

        public void setNameOfMaster(String nameOfMaster) {
            this.nameOfMaster = nameOfMaster;
        }

        public String getColorOfHair() {
            return colorOfHair;
        }

        public void setColorOfHair(String colorOfHair) {
            this.colorOfHair = colorOfHair;
        }

        // Phương thức
        public void bark() {    // In ra tiếng sủa của chó
            System.out.print("Gaau!!!");
        }

        public void addAge() {   // Thêm cho chó 1 tuổi
            this.age++;
        }

        public boolean IsBlack() {  // Kiểm tra xem có phải chó đen không
            return colorOfHair.equals("Black");
        }
    }


    public class Teacher {
        String name;
        String subjectTeach;
        int numOfCourse;

        //setter and getter

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSubjectTeach() {
            return subjectTeach;
        }

        public void setSubjectTeach(String subjectTeach) {
            this.subjectTeach = subjectTeach;
        }

        public int getNumOfCourse() {
            return numOfCourse;
        }

        public void setNumOfCourse(int numOfCourse) {
            this.numOfCourse = numOfCourse;
        }

        //Phuong thuc
        public void sayHello() {  //in ra loi chao
            System.out.println("Hello! I am a teacher");
        }

        public void addCourse() { //them 1 lop giang day
            numOfCourse++;
        }

        public void subCourse() { //giam di 1 lop giang day
            numOfCourse--;
        }

    }

    public class Student {
        String name;
        String id;
        String school;

        //getter and setter

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

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        // Phuong Thuc
        public void introduce() {  // In ra loi gioi thieu
            System.out.println("I am a Student.");
        }

        public boolean sameSchool(Student other) {
            return this.school.equals(other.school);
        }

        public void introduceName() {
            System.out.println("My name is" + name);
        }
    }

}
