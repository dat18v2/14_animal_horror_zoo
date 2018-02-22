public class School{
   
   public static void main(String[] args){
      //initialise student1
      Student student1 = new Student("Kurt Cobain", "Heaven 42", 25);
      Teacher teacher1 = new Teacher("Claus Bove", "Teachers Office 117");
      
      student1.printInfo();
      teacher1.printInfo();
      
      //change attributes of student1
      student1.setStudentPhone("Heaven nor Hell");
      student1.setStudentName("Volbeat");
      student1.setStudentAge(666);
      
      //change attributes of teacher1
      teacher1.setTeacherName("Jarl Tuxen");
      teacher1.setTeacherPhone("Teachers Office 118");
      
      //printInfo
      student1.printInfo();
      teacher1.printInfo();
      
   }
}