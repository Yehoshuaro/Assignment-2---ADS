public class Main {
    public static int WithoutSamsa(int[] studentPreferences, int[] samsas) {
        int circularSamsaLovers = 0;
        int squareSamsaLovers = 0;
        int totalStudents = samsas.length;
        for (int preference : studentPreferences) {
            if (preference == 1) {
                squareSamsaLovers++;
            } else {
                circularSamsaLovers++;
            }
        }
        for (int i = 0; i < totalStudents; i++) {
            if (samsas[i] == 0 && circularSamsaLovers > 0) {
                circularSamsaLovers--;
            }
            else if (samsas[i] == 1 && squareSamsaLovers > 0) {
                squareSamsaLovers--;
            }
            else {
                return totalStudents - i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] studentPreferences = {1, 1, 0, 0};
        int[] samsas = {0, 0, 1, 0};
        System.out.println(WithoutSamsa(studentPreferences, samsas));
    }
}


