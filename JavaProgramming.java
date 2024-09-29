import java.util.Scanner;

public class JavaProgramming 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter remote student details:");
        System.out.printf("ID - ");
        int remoteId = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Name - ");
        String remoteName = scanner.nextLine();
        RemoteStudents remoteStudent = new RemoteStudents(remoteId, remoteName);
        System.out.println("Enter the scores for student: " + remoteStudent.getName() + " with ID: " + remoteStudent.getId());
        System.out.printf("Midterm - ");
        double remoteMidterm = scanner.nextDouble();
        System.out.printf("Finals - ");
        double remoteFinals = scanner.nextDouble();
        System.out.printf("Assignments - ");
        double remoteAssignments = scanner.nextDouble();
        System.out.printf("Discussion - ");
        double remoteDiscussion = scanner.nextDouble();
        double remoteScore = remoteStudent.score(remoteMidterm, remoteFinals, remoteAssignments, remoteDiscussion);
        System.out.println(remoteStudent);
        System.out.printf("The weighted score for student %s is: %.2f%n", remoteStudent.getName(), remoteScore);

        System.out.println("\nEnter InPerson Student details:");
        System.out.printf("ID - ");
        int inPersonId = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Name - ");
        String inPersonName = scanner.nextLine();
        InPersonStudents inPersonStudent = new InPersonStudents(inPersonId, inPersonName);
        System.out.println("Enter the scores for student: " + inPersonStudent.getName() + " with ID: " + inPersonStudent.getId());
        System.out.printf("Midterm - ");
        double inPersonMidterm = scanner.nextDouble();
        System.out.printf("Finals - ");
        double inPersonFinals = scanner.nextDouble();
        System.out.printf("Assignments - ");
        double inPersonAssignments = scanner.nextDouble();
        double inPersonScore = inPersonStudent.score(inPersonMidterm, inPersonFinals, inPersonAssignments, 0);
        System.out.println(inPersonStudent);
        System.out.printf("The weighted score for student %s is: %.2f%n", inPersonStudent.getName(), inPersonScore);

        scanner.close();
    }
}
