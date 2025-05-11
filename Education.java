public class Education {
    private String degree;
    private String institution;
    private String year;

    public Education(String degree, String institution, String year) {
        this.degree = degree;
        this.institution = institution;
        this.year = year;
    }

    @Override
    public String toString() {
        return degree + ", " + institution + " (" + year + ")";
    }
}
