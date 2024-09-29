public class RemoteStudents extends Students
{
    public RemoteStudents(int id, String name)
    {
        super(id, name, "Remote");
    }

    @Override
    public double score(double midterm, double finals, double assignments, double discussion)
    {
        return (midterm * 0.30) + (finals * 0.30) + (assignments * 0.30) + (discussion * 0.10);
    }
}
