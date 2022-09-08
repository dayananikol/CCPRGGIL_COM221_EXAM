public class Student {
   
    String surname;
    String firstname;
    String middleinitial;
    String dateOfBirth;
    int studentNumber;
    public String studentEmailAddress;
    boolean iamawesome;

    public void saySurName() {
        System.out.println("Surname -"+  surname);
    }

    public void sayFirstName() {
        System.out.println("First name -" + firstname);
    }

    public void sayMiddleInitial() {
        System.out.println("Middle initial -" +  middleinitial);
    }


    public void sayDateOfBirth() {
        System.out.println("Date of Birth " + dateOfBirth);
    }
      
    public void sayMyStudentNumber() {
        System.out.println("My student number is - " + studentNumber);
    }

    public void sayMyStudentEmailAddress() {
        System.out.println("My student Email Address is - " + studentEmailAddress);
    }

    public void sayIAmAwesome() {
        System.out.println("i Am Awesome - " + iamawesome);
    }
}
