public class InPersonStudents extends Students
{
    public InPersonStudents(int id, String name)
    {
        super(id, name, "Inperson");
    }

    @Override
    public double score(double midterm, double finals, double assignments, double discussion)
    {
        return (midterm * 0.30) + (finals * 0.30) + (assignments * 0.40);
    }
}

