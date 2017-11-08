public class main1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("男生請輸入1");
        System.out.println("女生請輸入2");
        System.out.println("請輸入性別");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("請輸入身高");
            System.out.println("請輸入體重");
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double sw = (b - 80) * 0.7;
            double h = (b - sw) / sw * 100;
            if (c < (h* 0.8))
            {
                System.out.println("瘦弱");
            }
            if (c>= h * 0.8 && c <= h * 0.9) ;
            {
                System.out.println("過瘦");
            }
            if (c > h * 0.9 && c <= h * 1.1) ;
            {
                System.out.println("正常");
            }
            if (c > h * 1.1 && c <= h * 1.2) ;
            {
                System.out.println("過重");
            }
            if (c > h * 1.2) {
                System.out.println("肥胖");
            }
        }
             else
            {
            System.out.println("請輸入身高");
            System.out.println("請輸入體重");
            double e = sc.nextDouble();
            double f = sc.nextDouble();
            double sw1 = (e - 70) * 0.6;
            double i=(f-sw1)/sw1*100;
            if (f < (i * 0.8)) {
                System.out.println("瘦弱");
            }
            if (f >= i * 0.8 && f <= i * 0.9) ;
            {
                System.out.println("過瘦");
            }
            if (f > i * 0.9 && f <= i * 1.1) ;
            {
                System.out.println("正常");
            }
            if (f > i * 1.1 && f <= i * 1.2) ;
            {
                System.out.println("過重");
            }
            if (f > i * 1.2) {
                System.out.println("肥胖");
            }

        }
    }
}