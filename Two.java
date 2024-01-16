package Exam2_1;

public class Two extends One{
    private int j; 

    public Two(int parentJ, int childJ) {
        super(parentJ); 
        this.j = childJ;
    }

    public int calculateSum() {
        return super.j + this.j; 
    }
}
