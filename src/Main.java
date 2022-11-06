public class Main {
    public static void main(String[] args) {
        //задание 1
        {System.out.println("задание 1");}
        for(int i=1; i<=10; i++ ) {System.out.println(i);}

        //задание 2
        {System.out.println("задание 2");}
        for(int s=10; s>=1; s-- ) {System.out.println(s);}

        //задание 3
        {System.out.println("задание 3");}
        for(int x=0; x<=17; x+=2 ) {System.out.println(x);}

        //задание 4
        {System.out.println("задание 4");}
        for(int z=10; z>=-10; z--) {System.out.println(z);}

        //задание 5
        {System.out.println("задание 5");}
        for(int q=1904; q<=2096; q+=4) {System.out.println(q + " год является високосным");}

        //задание 6
        {System.out.println("задание 6");}
        for(int z=7; z<=98; z+=7) {System.out.println(z);}

        //задание 7
        {System.out.println("задание 7");}
        for(int z=1; z<=512; z*=2) {System.out.println(z);}

        //задание 8
        {System.out.println("задание 8");}
        int sumPerMonth = 29000;
        int month = 0;
        for(int z=1; z<=12; z++) {
            month = month + sumPerMonth;
            System.out.println("Месяц " + z + ", сумма накоплений равна " + month + " рублей.");
        }

        //задание 9
        {System.out.println("задание 9");}
        int sumPerMonth1 = 29000;
        int month1 = 0;
        for(int z=1; z<=12; z++) {
            month1 = month1 + month1/100;
            month1 = month1 + sumPerMonth1;
            System.out.println("Месяц " + z + ", сумма накоплений равна " + month1 + " рублей.");
        }


    }

}