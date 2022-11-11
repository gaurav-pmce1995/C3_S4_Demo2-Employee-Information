public class Manager extends Employee{
    private int teamSize;
    private int ratings;

    public Manager(int teamSize, int ratings) {
        this.teamSize = teamSize;
        this.ratings = ratings;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
    void display(){
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
        System.out.println("Dob : "+getDob());
        System.out.println("Address : "+getAddress());
        System.out.println("Salary : "+getSalary());
        System.out.println("Team size : "+teamSize);
        System.out.println("Ratings : "+ratings);
    }
}
