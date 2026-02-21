class employee {
    String name;
    int id;
    String department;
    int salary;

    public employee(String name, int id, String department, int salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}