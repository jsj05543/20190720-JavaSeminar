public class Hello {

    // 特集処理を行う専用のStringを用意するつもりで
    public static class String {
        private java.lang.String str = null;

        public String(java.lang.String str) {
            this.str = str;
        }

        @Override
        public java.lang.String toString() {
            return "\t" + str;
        }
    }

    public static void main(String... args) {
        String myString = new String("Hello M-IT!");
        System.out.println(myString);
    }

}
