public abstract class Department {
    abstract int getDepartmentSize();
}

class DepartmentOfComputerScience extends Department {
    int sizeOfDepartment;
    public int getDepartmentSize(){
        return sizeOfDepartment;
    }
}