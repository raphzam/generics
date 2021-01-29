public class Pair<A, B> {
    private A one;
    private B two;

    public Pair(A a, B b) {
        one = a;
        two = b;
    }

    public void setOne(A a) {
        one = a;
    }

    public A getOne(){
        return one;
    }

    public void setTwo(B b){
        two = b;
    }

    public B getTwo(){
        return two;
    }
}
