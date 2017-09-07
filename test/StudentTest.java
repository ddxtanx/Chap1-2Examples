import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student stu = new Student("Garrett", "123 park", 9, 200157);
    @Test
    void getYear() {
        assertEquals(stu.getYear(), 9);
    }
    void incrementYear() {
        stu.incrementYear();
        assertEquals(stu.getYear(), 10);
        stu.incrementYear();
        assertEquals(stu.getYear(), 11);
    }

    void getIdNum(){
        assertEquals(stu.getIdNum(), 200157);
    }

    void levelOfSchool(){
        assertEquals(stu.levelOfSchool(), "High School");
        Student preK = new Student("Baby", "Baby street", 0, 123213);
        assertEquals(preK.levelOfSchool(), "Pre-School");
        Student elementary = new Student("Elle", "Ele road", 4, 13313);
        assertEquals(elementary.levelOfSchool(), "Elementary School");
        Student middleSchool = new Student("Middy", "Biddy road", 7, 122122);
        assertEquals(middleSchool.levelOfSchool(), "Middle School");
        Student college = new Student("Collegiate", "Uni Road", 15, 1221331);
        assertEquals(college.levelOfSchool(), "Undergraduate Year Of College");
        Student out = new Student("Grad", "Grad School Way", 19, 11133111);
        assertEquals(out.levelOfSchool(), "Either out of school, or in Graduate School");
    }
    public static void main(String[] args) {
        System.out.println(stu);
    }
}