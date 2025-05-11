import java.util.*;

public class Resume {
    private String name;
    private String email;
    private String phone;
    private List<Education> educationList;
    private List<Experience> experienceList;
    private List<String> skills;

    public Resume(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.educationList = new ArrayList<>();
        this.experienceList = new ArrayList<>();
        this.skills = new ArrayList<>();
    }

    public void addEducation(Education edu) {
        educationList.add(edu);
    }

    public void addExperience(Experience exp) {
        experienceList.add(exp);
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public String buildResume() {
        StringBuilder sb = new StringBuilder();
        sb.append("========== RESUME ==========\n");
        sb.append("Name   : ").append(name).append("\n");
        sb.append("Email  : ").append(email).append("\n");
        sb.append("Phone  : ").append(phone).append("\n\n");

        sb.append("----- Education -----\n");
        for (Education edu : educationList) {
            sb.append("- ").append(edu).append("\n");
        }

        sb.append("\n----- Experience -----\n");
        for (Experience exp : experienceList) {
            sb.append("- ").append(exp).append("\n");
        }

        sb.append("\n----- Skills -----\n");
        for (String skill : skills) {
            sb.append("- ").append(skill).append("\n");
        }

        return sb.toString();
    }
}
