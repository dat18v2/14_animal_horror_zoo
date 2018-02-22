public class Teacher{
   private String name;
   private String phone;
   
   //constructors
   public Teacher(){
   }
   
   public Teacher(String name, String phone){
      this.name = name;
      this.phone = phone;
   }
   
   //set
   public void setTeacher(String name, String phone){
      this.name = name;
      this.phone = phone;
   }
   
   public void setTeacherName(String name){
      this.name = name;
   }
   
   public void setTeacherPhone(String phone){
      this.phone = phone;
   }
   
   //printTeacherInfo()
   public void printInfo(){
      System.out.println("Teacher name: " + name);
      System.out.println("Teacher phone: " + phone);
      System.out.println();
   }
      
}