//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MatrixManipulation matrixManipulation = new MatrixManipulation();
        int[] r = {100, 200, 300};
        matrixManipulation.replaceRow(3,r);
        matrixManipulation.copyMatrix();
        matrixManipulation.verifyProperty();
        matrixManipulation.fillSubmatrix(1 ,2,0,2,5);
    }
}