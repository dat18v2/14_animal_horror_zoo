public class School{
   
   public static void main(String[] args){
      //initialise student1
      Student student1 = new Student("Kurt Cobain", "Heaven 42", 20);
      Teacher teacher1 = new Teacher("Claus Bove", "Teachers Office 117");
      
      student1.printInfo();
      
      //change attributes of student1
      student1.setStudentPhone("Heaven nor Hell");
      
      student1.printInfo();
      teacher1.printInfo();
      
      System.out.println(Math.abs(3-5));
      /*
      Set exercise:
      Call setName, setPhone method with appropriate values
      Call printInfo method.
      */
      
      /* If exercise:
      test if the teacher is Claus
      - give him a warm greeting in the snow if so
      - otherwise just write a normal greeting
      do a check on age
      combine check on name with check on age
      use method to find out SU grant
      */
      
   }
}