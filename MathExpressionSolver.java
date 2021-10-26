package Calculator;

public  class MathExpressionSolver {
    public static char operation;
    public static double value1 ;
    public static double value2;
    public static String solution(){
        if(operation == '+')
            return String.valueOf(value1+value2) ;
        if(operation == '-')
            return String.valueOf(value1-value2);
        if(operation == '/')
            return String.valueOf(value1/value2);
        if(operation == '*')
            return String.valueOf(value1*value2);

        return null;
    }
}

