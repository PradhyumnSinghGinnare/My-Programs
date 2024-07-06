/* Que 6. Write an application to manipulate the voting machine according given criteria:
 *        The options are as followed:
 *          1. Vote casting.
 *          2. Show candidate's votes.
 *          3. Show comprehensive result.
 *          4. Exit.
 */

import java.util.Scanner;

public class Q6Vote {
    public static class Election{
        static int A, B, C;
        static int totalVotes;

        public void voteCasting(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Name of Candidates are: A, B, C");
            System.out.print("Enter your vote: ");
            String vote = sc.next();
            totalVotes++;

            if(totalVotes%5==0 || totalVotes%7==0){
                B++;
                System.out.println("Thanks for Voting!!!");
                return;
            } else if(vote.equals("A")){
                A++;
            } else if(vote.equals("B")){
                B++;
            } else if(vote.equals("C")){
                C++;
            } else{
                System.out.println("Invalid Vote!!!");
            }
            System.out.println("Thanks for Voting!!!");
        }

        public void CandidateVotes(){
            System.out.print("Enter the Candidate's Name: ");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();

            if(name.equals("A")){
                System.out.println("Votes of Candidate A: \n Votes: " + A + ", Total Votes: " + totalVotes);
            } else if(name.equals("B")){
                System.out.println("Votes of Candidate B: \n Votes: " + B + ", Total Votes: " + totalVotes);
            } else if(name.equals("C")){
                System.out.println("Votes of Candidate C: \n Votes: " + C + ", Total Votes: " + totalVotes);
            } else{
                System.out.println("Invalid Candidate's Name!!!");
            }
        }

        public void comprehensiveResult(){
            System.out.println("Comprehensive Result:");
            System.out.println("Party A: \nVotes: " + A + ", Total Votes: " + totalVotes);
            System.out.println("Party B: \nVotes: " + B + ", Total Votes: " + totalVotes);
            System.out.println("Party C: \nVotes: " + C + ", Total Votes: " + totalVotes);
        }
    }
    public static void main(String[] args) {
        Election el = new Election();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Vote Casting");
            System.out.println("2. Show Candidate's Vote");
            System.out.println("3. Show Comprehensive Result");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    el.voteCasting();
                    break;
                case 2:
                    el.CandidateVotes();
                    break;
                case 3:
                    el.comprehensiveResult();
                    break;
                case 4:
                    System.out.println("Exit..!!!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!!!");
            }
        }
    }
}