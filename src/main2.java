public class main2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("男生請輸入1");
        System.out.println("女生請輸入2");
        System.out.println("請輸入性別");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("請輸入身高");
            System.out.println("請輸入體重");
            Double b = sc.nextDouble();
            Double c = sc.nextDouble();
            double sw = (b - 80) * 0.7;
            System.out.println(sw);
            if (c > sw * 1.2) {
                System.out.println("肥胖");
            } else {
                if (c>sw*1.1) {
                    System.out.println("體重過重");
                } else {
                    if (c <= sw * 1.1 &&c>sw*0.9) {
                            System.out.println("體重正常");
                    } else {
                        if (c <= sw * 0.9 ) {
                            System.out.println("體重過輕");
                        } else {
                            System.out.println("體重不足");
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("請輸入身高");
            System.out.println("請輸入體重");
            Double d = sc.nextDouble();
            Double e = sc.nextDouble();
            double sw1=(d-70)*0.6;
            System.out.println(d);
            if(e > sw1 * 1.2)
            {
                System.out.println("肥胖");
            }
            else{
                if(e>sw1*1.1)
                {
                    System.out.println("體重過重");
                }
                else{
                    if(e <= sw1 * 1.1 &&e>sw1*0.9)
                    {
                        System.out.println("正常");
                    }
                    else{
                        if(e <= sw1 * 0.9 )
                        {
                            System.out.println("體重過輕");
                        }
                        else{
                            System.out.println("體重不足");
                        }
                    }
                }
            }

        }
    }
}







