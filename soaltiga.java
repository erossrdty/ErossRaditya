public class soaltiga {
    public static void main(String[] args) {
        int angka[] = {1, 8, 13, 17, 18, 19, 20};
        int key = 18;
        int index = angka.length / 2;
        boolean n = false;
        int tengah = index;

        while (index >= 0 && index < angka.length && n == false) {
            if (key == angka[index]) {
                System.out.println("Data terdapat pada index ke-" + index);
                n = true;
            } else {
                if (key < angka[tengah]) {
                    index--;
                } else {
                    index++;
                }
            }
        }
        if (n == false) {
            System.out.println("Data tidak ditemukan");
        }
    }
}