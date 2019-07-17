import javax.naming.ServiceUnavailableException;

public class SwitchTest {

    private static int Monday = 1;
    private static int Tuesday = 2;
    private static int Wednesday = 3;
    private static int Thursday = 4;
    private static int Friday = 5;
    private static int Saturday = 6;
    private static int Sunday = 7;

    private static String switchOld(int weekday) {
        String time;

        switch (weekday) {
            case 1:
            case 2:
            case 3:
                time = "10:00-18:00";
                break;
            case 4:
            case 5:
                time = "10:00-14:00";
                break;
            default:
                time = "休日";
        }

        return time;
    }

    private static String switchNew(int weekday) {
        return switch (weekday) {
            case 1, 2, 3 ->  "10:00-18:00";
            case 4, 5 -> "10:00-14:00";
            default -> "休日";
        };
    }

    // VM option に「--enable-preview」の設定必要
    public static void main(String[] args) {
        System.out.println("営業時間は："+ switchOld(Monday));
        System.out.println("営業時間は："+ switchNew(Sunday));
    }
}
