import java.util.*;

public class Q7ExamCenter {
    public static class examCenter{
        String name, dob, fatherName, allotedCenter;
        int uid = 2325000;

        static ArrayList<Object> student = new ArrayList<Object>();
        examCenter profile = new examCenter();

        Scanner sc = new Scanner(System.in);

        public void examCenter(String name, String dob, String fatherName, int uid, String allotedCenter){
            this.name = name;
            this.dob = dob;
            this.fatherName = fatherName;
            this.uid = uid;
            this.allotedCenter = allotedCenter;
        }

        public int uidInt(Q7ExamCenter.examCenter profile){
            this.profile = profile;
            return profile.uid;
        }

        public void profileRegistration(){
            System.out.println("Enter Student Details:");
            System.out.print("Enter your Name: ");
            name = sc.next();
            System.out.print("Enter Date of Birth (dd-mm-yyyy): ");
            dob = sc.next();
            System.out.print("Enter Father's Name: ");
            fatherName = sc.next();
            uid++;

            profile.examCenter(name, dob, fatherName, uid, allotedCenter);
            student.add(profile);

            int userId = sc.nextInt();
            
            for(int i=0; i<student.size()-1; i++){
                int ui = uidInt(profile);
                if(ui == userId){
                    
                }
            }
        }

    }
    public static void main(String[] args) {
        
    }
}
