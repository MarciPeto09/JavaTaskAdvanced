package school;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Ana", "Tirane");
        System.out.println(person);

        Student student = new Student("Kaltra", "Fier", "Computer Science", 2, 15000.0);
        System.out.println(student);

        Staff staff = new Staff("Sana", "Durres", "Cybersecurity", 85000.9);
        System.out.println(staff);

    }

}

       class Person{
           String name;
           String address;

           public Person() {
           }

           public Person(String name, String address) {
               this.name = name;
               this.address = address;
           }

           public String getName() {
               return name;
           }

           public void setName(String name) {
               this.name = name;
           }

           public String getAddress() {
               return address;
           }

           public void setAddress(String address) {
               this.address = address;
           }

           @Override
           public String toString() {
               return String.format("%s -> %s", name, address);
           }
       }

       class Student extends Person{
            String study;
            int yearOfStudy;
            double studyPrice;

          public Student(String name, String address, String study, int yearOfStudy, double studyPrice) {
                super(name, address);
                this.study = study;
                this.yearOfStudy = yearOfStudy;
                this.studyPrice = studyPrice;
            }

            public String getStudy() {
                return study;
            }

            public void setStudy(String study) {
                this.study = study;
            }

            public int getYearOfStudy() {
                return yearOfStudy;
            }

            public void setYearOfStudy(int yearOfStudy) {
                this.yearOfStudy = yearOfStudy;
            }

            public double getStudyPrice() {
                return studyPrice;
            }

            public void setStudyPrice(double studyPrice) {
                this.studyPrice = studyPrice;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", address='" + address + '\'' +
                        ", typeOfStudies='" + study + '\'' +
                        ", yearOfStudy='" + yearOfStudy + '\'' +
                        ", studiesPrice=" + studyPrice +
                        '}';
            }

        }

        class Staff extends Person{
            String specialization;
            double salary;


    public Staff(String name, String address, String specialization, double salary) {
                super(name, address);
                this.specialization = specialization;
                this.salary = salary;
            }

            public String getSpecialization() {
                return specialization;
            }

            public void setSpecialization(String specialization) {
                this.specialization = specialization;
            }

            public double getSalary() {
                return salary;
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }

            @Override
            public String toString() {
                return  "Staff{" +
                        "name='" + name + '\'' +
                        ", address='" + address + '\'' +
                        ", specialization='" + specialization + '\'' +
                        ", salary='" + salary + '\'' +
                        '}';
            }
        }


