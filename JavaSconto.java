import java.util.Scanner;

public class JavaSconto {

	public static void main(String[] args) {
		System.out.println("Inserisci il importo che hai conseguito:");
            try (Scanner importo = new Scanner(System.in)) {
                int num = importo.nextInt();
                int res;
                if (num >= 200) {
                    res = (num * 20) / 100;
                    System.out.println("Hai accesso al 20% di sconto" + res);
                }
                if (num >= 100) {
                    res = (num * 10) / 100;
                    System.out.println("Hai accesso al 10% di sconto" + res);
                }
                if (num < 100) {
                    res = (num * 0) / 100;
                    System.out.println("Non ai accesso al nessun sconto" + res);
                }
            }
	}

}
