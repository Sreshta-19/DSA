package LinkedList;
import java.util.*;
import java.util.stream.Collectors;
public class StreamsPractice {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
    new Employee(101, "Alice", "HR", 70000, 28, "Mumbai", 
        new ArrayList<>(Arrays.asList("Reading", "Yoga"))),

    new Employee(102, "Bob", "IT", 85000, 32, "Bangalore", 
        new ArrayList<>(Arrays.asList("Gaming", "Cycling"))),

    new Employee(103, "Charlie", "Finance", 65000, 25, "Delhi", 
        new ArrayList<>(Arrays.asList("Investing", "Chess"))),

    new Employee(104, "David", "IT", 95000, 35, "Hyderabad", 
        new ArrayList<>(Arrays.asList("Traveling", "Photography"))),

    new Employee(105, "Eva", "HR", 72000, 45, "Chennai", 
        new ArrayList<>(Arrays.asList("Cooking", "Blogging"))),

    new Employee(106, "Frank", "Marketing", 68000, 29, "Pune", 
        new ArrayList<>(Arrays.asList("Running", "Music"))),

    new Employee(107, "Grace", "Finance", 81000, 38, "Kolkata", 
        new ArrayList<>(Arrays.asList("Dancing", "Painting"))),

    new Employee(108, "Henry", "IT", 89000, 31, "Bangalore", 
        new ArrayList<>(Arrays.asList("Cricket", "Coding"))),

    new Employee(109, "Ivy", "Marketing", 61000, 26, "Jaipur", 
        new ArrayList<>(Arrays.asList("Swimming", "Podcasting"))),

    new Employee(110, "Jack", "HR", 73000, 41, "Mumbai", 
        new ArrayList<>(Arrays.asList("Storytelling", "Volunteering")))
);
//print all
//employees.stream().forEach(System.out::println);
//filter with salary >70,000
//employees.stream().filter(e->e.getSalary()>70000).forEach(System.out::println);
//names of all in IT
//employees.stream().filter(e->e.getDep().equals("IT")).map(e->e.getName()).forEach(System.out::println);
//sort e,ployess by age
System.out.println(employees.stream().sorted(Comparator.comparingInt(e->e.getAge())).collect(Collectors.toList()));
//get highest paid
System.out.println();
    }
}
class Employee{
    private int id;
    private String name;
    private String dep;
    private double salary;
    private int age;
    private String city;
    private ArrayList<String> hobbies;
    public Employee(int id,String name,String dep,double salary,int age,String city,ArrayList<String> hobbies){
           this.id=id;
           this.name=name;
           this.dep=dep;
           this.salary=salary;
           this.age=age;
           this.city=city;
           this.hobbies=hobbies;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDep() {
        return dep;
    }
    public void setDep(String dep) {
        this.dep = dep;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public ArrayList<String> getHobbies() {
        return hobbies;
    }
    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }
    @Override
public String toString() {
    return "id=" + id +
            ", name='" + name + '\'' +
            ", department='" + dep + '\'' +
            ", salary=" + salary +
            ", age=" + age +
            ", city='" + city + '\'' +
            ", hobbies=" + hobbies +
            '}';
}   
}