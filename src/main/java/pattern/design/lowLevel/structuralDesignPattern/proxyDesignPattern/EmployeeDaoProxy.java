package pattern.design.lowLevel.structuralDesignPattern.proxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create() {
//        if(client == "ADMIN"){

//        }
    }

    @Override
    public void delete() {

    }
}
