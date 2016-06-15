import java.util.ArrayList;

public class whileLoop {
    private ArrayList<Token> conditionTokens;
    //    private ArrayList<Token> instructionTokens;
    private int myStartingPoint;
    private ArrayList<Token> iterationTokens;
    public whileLoop(ArrayList<Token> tokens) {
        conditionTokens = new ArrayList<Token>();
        setConditionTokens(tokens.get(tokens.size() - 3), tokens.get(tokens.size() - 2), tokens.get(tokens.size() - 1));

    }

    public void setMyStartingPoint(int sP) {
        this.myStartingPoint = sP;
    }

    public int getMyStartingPoint() {
        return myStartingPoint;
    }

    public void setIterationTokens(ArrayList<Token> iterationTokens){
        this.iterationTokens = iterationTokens;
    }

    public ArrayList<Token> getIterationTokens(){
        return iterationTokens;
    }

    private void setConditionTokens(Token fOperand, Token sOperand, Token operation) {
        conditionTokens.add(fOperand);
        conditionTokens.add(sOperand);
        conditionTokens.add(operation);
    }

    public ArrayList<Token> getConditionTokens() {
        return conditionTokens;
    }
}
