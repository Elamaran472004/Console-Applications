import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Basic Info
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        System.out.print("Enter your phone number: ");
        String phone = sc.nextLine();

        Resume resume = new Resume(name, email, phone);

        // Education Section
        System.out.println("\nAdd Education Details:");
        while (true) {
            System.out.print("Degree: ");
            String degree = sc.nextLine();
            System.out.print("Institution: ");
            String institution = sc.nextLine();
            System.out.print("Year: ");
            String year = sc.nextLine();

            resume.addEducation(new Education(degree, institution, year));

            System.out.print("Add more education? (y/n): ");
            if (!sc.nextLine().equalsIgnoreCase("y")) break;
        }

        // Experience Section
        System.out.println("\nAdd Work Experience:");
        while (true) {
            System.out.print("Role: ");
            String role = sc.nextLine();
            System.out.print("Company: ");
            String company = sc.nextLine();
            System.out.print("Duration: ");
            String duration = sc.nextLine();

            resume.addExperience(new Experience(role, company, duration));

            System.out.print("Add more experience? (y/n): ");
            if (!sc.nextLine().equalsIgnoreCase("y")) break;
        }

        // Skills Section
        System.out.println("\nAdd Skills:");
        while (true) {
            System.out.print("Skill: ");
            String skill = sc.nextLine();
            resume.addSkill(skill);

            System.out.print("Add more skills? (y/n): ");
            if (!sc.nextLine().equalsIgnoreCase("y")) break;
        }

        // Display Resume
        String finalResume = resume.buildResume();
        System.out.println("\n\n" + finalResume);

        // Save to file
        System.out.print("Do you want to save this resume to a file? (y/n): ");
        if (sc.nextLine().equalsIgnoreCase("y")) {
            try (FileWriter fw = new FileWriter("resume.txt")) {
                fw.write(finalResume);
                System.out.println("✅ Resume saved to resume.txt");
            } catch (IOException e) {
                System.out.println("❌ Error saving file: " + e.getMessage());
            }
        }

        sc.close();
    }
}
