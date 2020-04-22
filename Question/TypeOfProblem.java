package Question;

public class TypeOfProblem {
    public enum TypeProblem{IIIDShapeSA, IIIDShapeV};
    public static TypeOfProblem typeofproblem;
    private TypeProblem typeproblem;
    
    public void setTypeOfProblem(TypeProblem TypeProblem) {
        typeproblem = TypeProblem;
    }

    public TypeProblem getTypeProblem() {
        return typeproblem;
    }
    private TypeOfProblem(){

    }
    public static TypeOfProblem get_Instance() {
        if(typeofproblem == null)
            typeofproblem = new TypeOfProblem();
        return typeofproblem;
    }
}
