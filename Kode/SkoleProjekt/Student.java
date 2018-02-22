public class Student{

   private String name;
   private String phone;
   private int age;
   
   //constructors
   public Student(){
   
   }
   
   public Student(String name, String phone, int age){
      this.name = name;
      this.phone = phone;
      this.age = age;
   }
   
   //set
   public void setStudent(String name, String phone, int age){
      this.name = name;
      this.phone = phone;
      this.age = age;
   }
   
   public void setStudentName(String name){
      this.name = name;
   }
   
   public void setStudentPhone(String phone){
      this.phone = phone;
   }
   
   public void setStudentAge(int age){
      this.age = age;
   }
   
   //printStudentInfo()
   public void printInfo(){
      System.out.println("Student name: " + name);
      System.out.println("Student phone: " + phone);
      System.out.println("Student age: " + age);
      /*
      if (...){
         print et eller andet
      }
      else if (...){
         skriv noget andet
      }
      else{
         skriv noget tredie
      }
      */
      System.out.println();
   } 
   
   
   /* if exercise
   make method to test if older than 18
   make test for ranges of age (limited SU, full SU, retirement aid)
   16-17: limited SU
   18-65: full SU
   66-: retirement aid instead of SU
   
   if (15<=alder && alder<18){
   }
   else if (!(15<=alder && alder<18) && (alder==27)){
   }
   else{
   }
   
   From School:
   test if name is Claus (equals method)
   use age test
   combine age test with test on name
   */
   
}