public class Experience {
    private String role;
    private String company;
    private String duration;

    public Experience(String role, String company, String duration) {
        this.role = role;
        this.company = company;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return role + " at " + company + " [" + duration + "]";
    }
}
