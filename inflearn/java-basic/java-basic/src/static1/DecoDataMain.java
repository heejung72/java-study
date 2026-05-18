package static1;

public class DecoDataMain {
    public static void main(String[] args) {
        DecoData.staticCall();

        DecoData d1 = new DecoData();
        d1.instanceMethod();
        DecoData d2 = new DecoData();
        d2.instanceMethod();

        DecoData d3 = new DecoData();
        d3.staticMethod(d3);
    }
}
