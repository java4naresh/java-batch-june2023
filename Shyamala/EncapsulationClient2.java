public class EncapsulationClient2 {

  public static void main (String[] args) {
      EmployeeInfo employeeInfo = new EmployeeInfo();
      System.out.println(employeeInfo);
      employeeInfo.setname("syamala");
      employeeInfo.setgender('f');
      employeeInfo.setage(22);
      employeeInfo.setIdno(10);
      employeeInfo.setsalary("50000.00");
      employeeInfo.setexperience('5years');
      employeeInfo.setemail("syamalatelluri@email.com");
      System.out.println(employeeInfo);
}
}
