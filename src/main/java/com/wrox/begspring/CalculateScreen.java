package com.wrox.begspring;

public class CalculateScreen {

    private ResultWriter wtr = new ScreenWriter();
    private Operation ops = new OpAdd();



    public void execute(String[] args){
        long op1 = Long.parseLong(args[0]);
        long op2 = Long.parseLong(args[1]);

        wtr.showResult("The result of " + op1 +
                ops.getOpsName() + op2 + " is "
                + ops.operate(op1, op2) + "!");
    }


    public static void main(String[] args){
        new CalculateScreen().execute(args);
    }
}
