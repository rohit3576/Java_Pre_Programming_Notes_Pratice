package mobileshop;

import java.util.Scanner;

public class ShopDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========= Welcome To Mobile Shop =========");

        System.out.println("Choose Brand");
        System.out.println("1 Samsung");
        System.out.println("2 IPhone");
        System.out.println("3 Lumia");
        System.out.println("4 Pixel");

        int brand = sc.nextInt();

        Mobile mobile = null;   // reference for model object

        switch(brand)
        {

            case 1:

                Samsung samsung = new Samsung();   // brand object created

                System.out.println("Choose Samsung Model");
                System.out.println("1 S23  2 S24  3 ZFold");

                int s = sc.nextInt();

                if(s==1) mobile = new S23();
                if(s==2) mobile = new S24();
                if(s==3) mobile = new ZFold();

                break;


            case 2:

                IPhone iphone = new IPhone();   // brand object created

                System.out.println("Choose IPhone Model");
                System.out.println("1 IPhone14  2 IPhone15  3 IPhone16");

                int i = sc.nextInt();

                if(i==1) mobile = new IPhone14();
                if(i==2) mobile = new IPhone15();
                if(i==3) mobile = new IPhone16();

                break;


            case 3:

                Lumia lumia = new Lumia();   // brand object created

                System.out.println("Choose Lumia Model");
                System.out.println("1 Lumia920  2 Lumia950  3 Lumia1020");

                int l = sc.nextInt();

                if(l==1) mobile = new Lumia920();
                if(l==2) mobile = new Lumia950();
                if(l==3) mobile = new Lumia1020();

                break;


            case 4:

                Pixel pixel = new Pixel();   // brand object created

                System.out.println("Choose Pixel Model");
                System.out.println("1 Pixel7  2 Pixel8  3 PixelFold");

                int p = sc.nextInt();

                if(p==1) mobile = new Pixel7();
                if(p==2) mobile = new Pixel8();
                if(p==3) mobile = new PixelFold();

                break;

        }

        if(mobile != null)
        {
            mobile.show();   // polymorphism
        }

        sc.close();
    }

}