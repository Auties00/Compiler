public class ReceiverTest {
    static class Abc {
        public String getCode(Abc this){
            return "";
        }
    }

    public static void main(String[] args) {
        var abc = new Abc();
        abc.getCode();
    }
}
