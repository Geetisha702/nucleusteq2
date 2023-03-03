 class Student {
     
     String name,course,rNum,mark1,mark2,total,avg,mark,grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getrNum() {
        return rNum;
    }

    public void setrNum(String rNum) {
        this.rNum = rNum;
    }

    public String getMark1() {
        return mark1;
    }

    public void setMark1(String mark1) {
        this.mark1 = mark1;
    }

    public String getMark2() {
        return mark2;
    }

    public void setMark2(String mark2) {
        this.mark2 = mark2;
    }
    
    String calTotal()
    {
        String tot1,tot2;
        tot1=getMark1();
        tot2=getMark2();
        total=Integer.toString(Integer.parseInt(tot1)+Integer.parseInt(tot2));
                
    return total;}
    
    String calAverage()
    { avg=calTotal();
      avg=Integer.toString(Integer.parseInt(avg)/2);
    return avg;}
    
     String calGrade()
     {
         mark=calAverage();
         switch(mark){
         
             case "50":
         return "A";
          case "40":
         return "B";
          case "30":
         return "C";
          case "20":
         return "D";
          default  :
         return "E";
         }
     }
     
     public String toString()
     { String sName=getName();
     String sNum=getrNum();
     String sgrade=calGrade();
     return sName+" "+sNum+" "+sgrade; }
    
}
public class StudentTest
        {public static void main(String...ar)
        {
        Student st=new Student();
        st.setName("abeer");
        st.setrNum("1");
        st.setMark1("90");
           st.setMark2("90");
           st.calTotal();
              st.calAverage();
                 st.calGrade();
                 System.out.print(st);
        Student st1=new Student();
         st1.setName("biswa");
        st1.setrNum("2");
        st1.setMark1("80");
           st1.setMark2("80");
           st1.calTotal();
              st1.calAverage();
                 st1.calGrade();
                 System.out.print(st1);
        Student st2=new Student();
         st2.setName("esha");
        st2.setrNum("3");
        st2.setMark1("70");
           st2.setMark2("70");
           st2.calTotal();
              st2.calAverage();
                 st2.calGrade();
                 System.out.print(st2);
        Student st3=new Student();
         st3.setName("radhika");
        st3.setrNum("4");
        st3.setMark1("100");
           st3.setMark2("100");
           st3.calTotal();
              st3.calAverage();
                 st3.calGrade();
                 System.out.print(st3);
        Student st4=new Student();
         st4.setName("sukshm");
        st4.setrNum("6");
        st4.setMark1("50");
           st4.setMark2("50");
           st4.calTotal();
              st4.calAverage();
                 st4.calGrade();
                 System.out.print(st4);}}