public class Students {
    // Atribut (instance variable)
    Integer NPM;
    String Fullname;
    String ClassName;
    Integer Semester;
    Float GPA;

    // Method sesuai class diagram
    Integer getNPM(Integer value) {
        NPM = value;
        return NPM;
    }

    String getFullname(String value) {
        Fullname = value;
        return Fullname;
    }

    String getClassName(String value) {
        ClassName = value;
        return ClassName;
    }

    Integer getSemester(Integer value) {
        Semester = value;
        return Semester;
    }

    Float getGPA(Float value) {
        GPA = value;
        return GPA;
    }
}