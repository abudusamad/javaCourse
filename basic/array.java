public class array {
    public static void main(String[] args) {
        int month_days[];
        month_days = new int[6];

        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2]= 31;
        month_days[3] = 30;
        month_days[4]= 31;
        month_days[5]= 30;

        for (int i = 0; i < month_days.length; i++){
            if (month_days[i] == 30) {
                break;
            }
            System.out.println("The is no :" + month_days[i]);
        }
    }

}
