public class ManagerImpl {
    public static void main(String[] args) {
        Manager manager = new Manager(5,4);
        manager.setName("Gaurav");
        manager.setAge(27);
        manager.setDob("17/09/1995");
        manager.setAddress("North east Delhi");
        manager.setSalary(20000);
        manager.display();
    }
}
