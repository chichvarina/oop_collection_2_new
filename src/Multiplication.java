public class Multiplication {
    private final int number1;
    private final int number2;

    public Multiplication(int number1,int number2) {
        this.number1=number1;
        this.number2=number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }else if(obj==null){
            return false;
        }else if(this.getClass()!=obj.getClass()){
            return false;
        }
        Multiplication m = (Multiplication) obj;
        return this.number1*this.number2==m.number1*m.number2;
    }

    @Override
    public int hashCode() {
        return number1*number2;
    }

    @Override
    public String toString() {
        return "\n"+number1+" * "+number2;
    }
}
