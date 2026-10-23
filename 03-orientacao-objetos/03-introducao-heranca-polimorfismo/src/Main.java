public class Main {
    public void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salesman());

    }

    public static void printEmployee(Employee employee) {

        System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());

        System.out.println("================");
        switch (employee) {
            case Manager manager -> {
                manager.setCode("123");
                manager.setName("Lucas");
                manager.setSalary(5000);
                manager.setLogin("joao");
                manager.setPassword("123456");
                manager.setComission(1200);


                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getComission());


            }
            case Salesman salesman -> {
                salesman.setCode("123456");
                salesman.setName("João");
                salesman.setSalary(2800);
                salesman.setPercentSold(10);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentSold());
            }
        }
        System.out.println("=============");
    }

}
