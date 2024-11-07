package ie.atu.encapsulation;

public class Grade {
    private String name;
    private String course;
    private int grade;

    // Constructor uses validation helpers
    public Grade(String name, String course, int grade) {
        this.name = validateName(name);
        this.course = validateCourse(course);
        this.grade = validateGrade(grade);
    }

    // Setters use the same validation helpers
    public void setName(String name) {
        this.name = validateName(name);
    }

    public void setCourse(String course) {
        this.course = validateCourse(course);
    }

    public void setGrade(int grade) {
        this.grade = validateGrade(grade);
    }

    // Private validation helper methods
    private String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        return name;
    }

    private String validateCourse(String course) {
        // Adjusted the validation to ensure the course code has the correct format
        if (course == null || !course.matches("[A-Z]{2}\\d{3}")) {
            throw new IllegalArgumentException("Course code must match the pattern (e.g., CS101).");
        }
        return course;
    }

    private int validateGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        return grade;
    }

    // Method to get the letter grade
    public String getLetterGrade() {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else if (grade >= 50) {
            return "E";
        } else {
            return "F";
        }
    }

    // Method to display information about the grade
    public String displayGradeInfo() {
        return "Student Name: " + name +
               ", Numeric Grade: " + grade +
               ", Course Code: " + course +
               ", Letter Grade: " + getLetterGrade();
    }
}

