public class TestClass {
    String StrValue;
    int IntValue;

    TestClass(String StrValue, int IntValue) {
        this.StrValue = StrValue;
        this.IntValue = IntValue;
    }

    @Override
    public String toString() {
        return "TestStr: " + StrValue + ", TestInt: " + IntValue;
    }
}