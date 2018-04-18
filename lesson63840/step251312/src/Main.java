class Employee {

    String name;
    int salary;
    String address;
    Employee(){
        name = "unknown";
        salary = 0;
        address = "unknown";
    }
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
        this.address = "unknown";
    }
    Employee(String name, int salary, String address){
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}