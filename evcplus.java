import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class evcplus {
    public static void main() {
        Scanner input=new Scanner(System.in);


        System.out.println("===== EVC PLUS =====");

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("1. Itus Haraaga");
        menu.add("2. Kaarka Hadalka");
        menu.add("3. Bixi Biil");
        menu.add("4. U wareeji EVCPLUS");
        menu.add("5. Warbixin Kooban");
        menu.add("6. Salaam Bank");
        menu.add("7. Maareynta");
        menu.add("8. Biil Payment");
        Collections.sort(menu);
        for (String item : menu) {
            System.out.println(item);
        }
        System.out.print("Enter your choice: ");
        Scanner scanner=new Scanner(System.in);

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> balance();
            case 2 -> karka();
            case 3 -> Biil();
            case 4 -> Uwareeji();
            case 5 -> Warbixin();
            case 6 -> banking();
            case 7 -> Maareyn();
            case 8 -> payment();
            case 9 -> System.out.println("Exit");
            default -> System.out.println("Invalid choice");
        }
    }

    // BALANCE METHOD
    static void balance() {
        double balance = 500;
        System.out.println("Haraagaagu waa: " + balance);
    }

    // KAARKA HADALKA METHOD
    static void karka() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("===== KAARKA HADALKA =====");
        System.out.println("1. Ku shubo Airtime");
        System.out.println("2. Ugu shub Airtime");
        System.out.println("3. MIFI Packages");
        System.out.println("4. Ku shubo Internet");
        System.out.println("5. Ugu shub qof kale");
        System.out.println("6. Exit");
        int haraaga = 500;
        System.out.print("Dooro: ");
        int dooro = scanner.nextInt();

        switch (dooro) {
            case 1 -> {
                System.out.println("Ku shubo Airtime");
                System.out.println("Fadlan Gali lacgat");
                int lacag = scanner.nextInt();
                System.out.println("Ma Hubta Inaad $" + lacag + " " + "ugu shubeysid ");
                System.out.println("1.Haa");
                System.out.println("2.Maya");
                int haa = scanner.nextInt();
                if (haa == 1) {
                    haraaga -= lacag;
                    System.out.println("haraagagu waa $" + haraaga);
                } else
                    System.out.println("exist");
            }
            case 2 -> {
                System.out.println("Ugu shub Airtime");
                System.out.println("Fadlan Gali Mobilka");
                int mobile = scanner.nextInt();
                System.out.println("Fadlan Gali lacgat");
                int lacag = scanner.nextInt();
                System.out.println("Ma Hubtaa inaad $" + lacag + " " + "Ugu shubtid" + " " + mobile + "?");
                System.out.println("1.Haa");
                System.out.println("2.Maya");
                int haa = scanner.nextInt();
                if (haa == 1) {
                    haraaga -= lacag;
                    System.out.println("haraagagu waa $" + haraaga);
                } else
                    System.out.println("exist");
            }
            case 3 -> {
                System.out.println("*** MIFI Packages ***");
                System.out.println("Ku shubo Data-da MIFI");
                int data = scanner.nextInt();
                System.out.println("Internet Bundle Rechange-");
                System.out.println("1. Isbucley (weekly)");
                System.out.println("2. Maalinle (Daily)");
                System.out.println("3. Bille (MIF)");
                int bille = scanner.nextInt();
                if (bille == 1) {
                    haraaga -= data;
                    System.out.println("haraagagu waa $" + haraaga);
                } else if (bille == 2) {
                    haraaga -= data;
                    System.out.println("haraagagu waa $" + haraaga);

                } else if (bille == 3) {
                    haraaga -= data;
                    System.out.println("haraagagu waa $" + haraaga);
                } else
                    System.out.println("exist");
            }
            case 4 -> {
                System.out.println(" *** Ku shubo Internet ****");
                System.out.println("Fadlan Dooro Numberka ad ku shubeysid");
                System.out.println("1. Isbucley (weekly)");
                System.out.println("2. Time Based Packages");
                System.out.println("3. Data");
                System.out.println("4. Maalinle (Daily)");
                System.out.println("5. Bille (MIF)");
                int data = scanner.nextInt();
                System.out.println("Fadlan Gali lacagta");
                int lacagta = scanner.nextInt();
                System.out.println("Ma hubta $" + " " + lacagta + "  " + "ku shubtid ");
                System.out.println("1.Haa");
                System.out.println("2.Maya");
                int haa = scanner.nextInt();
                if (haa == 1) {
                    haraaga -= lacagta;
                    System.out.println("haraagagu waa $" + haraaga);
                } else
                    System.out.println("exist");
            }
            case 5 -> {
                System.out.println("Ugu shub qof kale");
                System.out.println("Fadlan Gali mobile");
                int mobile = scanner.nextInt();
                System.out.println("Fadlan Gali lacagta");
                int lacag = scanner.nextInt();
                System.out.println("Ma hubta inaad $" + lacag + "ugu shubtid" + " " + mobile);
                System.out.println("1.Haa");
                System.out.println("2.Maya");
                int haa = scanner.nextInt();
                if (haa == 1) {
                    haraaga -= lacag;
                    System.out.println("haraagagu waa $" + haraaga);
                } else
                    System.out.println("exist");
            }
            case 6 -> System.out.println("Exit");
            default -> System.out.println("Doorasho khaldan");
        }
    }

    //    qeybta bixi biilka
    static void Biil() {
        System.out.println("BIXI BIIL");
        System.out.println("1. Post Paid");
        System.out.println("2. Ku Ibso");

        System.out.println("DOORO");
        Scanner scanner=new Scanner(System.in);
        int dooro = scanner.nextInt();
        switch (dooro) {
            case 1 -> {
                System.out.println("Post paid");
                System.out.println("1. Ogow biilka ");
                System.out.println("2. BIXI biilka");
                System.out.println("3. Ka bixi biilka");
            }
            case 2 -> {

                System.out.println("ku Ibso");
                System.out.println("Fadlan Galin Aqoonsiga Ganacsigaga ");
                int aqonsi = scanner.nextInt();

            }
        }
    }
//    QEYBTA U WAREEJI LACAG

    static void Uwareeji() {
        Scanner scanner=new Scanner(System.in);

        int haraaga = 500;
        System.out.println("Uwareji EVC PLUS");
        System.out.println("Fadlan Gali Numberka");
        int warejin = scanner.nextInt();
        System.out.println("Fadlan Gali lacgat");
        int lacag = scanner.nextInt();
        System.out.println("Ma Hubtaa inaad $" + lacag + " " + "Ugu shubtid" + " " + warejin + "?");
        System.out.println("1. Haa");
        System.out.println("2. Maya");
        int haa = scanner.nextInt();
        if (haa == 1) {
            haraaga -= lacag;
            System.out.println("haraagagu waa $" + haraaga);
        } else
            System.out.println("exist");
    }

    //        QEYBTA WARBIXIN KOOBAN
    static void Warbixin() {
        System.out.println("*****Warbixin Kooban******");
        System.out.println("1.Last Action ");
        System.out.println("2.Wareejintii U danbeysay");
        System.out.println("3.Ibsashada u danbeysa");
        System.out.println("4.Last 3 action");
        System.out.println("5.Email me My Activity");

        System.out.println("DOORO");
        Scanner scanner=new Scanner(System.in);

        int dooro = scanner.nextInt();
        switch (dooro) {
            case 1 -> System.out.println("1.Last Action ");
            case 2 -> {
                System.out.println("2.Wareejintii U danbeysay");
                System.out.println("statement");
                System.out.println("1. U dirtay");
                System.out.println("2. Ka heshay");
                System.out.println("dooro");
                int doro = scanner.nextInt();
                {
                    System.out.println("1. U dirtay");
                    System.out.println("Fadlan Galin Moblike ");
                    int mobile = scanner.nextInt();
                    System.out.println("waxad Udirtay $" + mobile);

//                    SOO LAABASHO WEEEYE QEYBTAAN
                }

                System.out.println("2. Ka heshay");
                System.out.println("Fadlan Galin Moblike ");
                int mobile = scanner.nextInt();
                System.out.println("waxad ka heshay $" + mobile);

            }
            case 3 -> System.out.println("3.Libsashada u danbeysa");
            case 4 -> System.out.println("4.Last 3 action");
            case 5 -> System.out.println("5.Email me My Activity");
        }
    }

    //         Salaam Banking
    static void banking() {
        System.out.println("****** salaam banking *****");
        System.out.println("1.Itus haragaaga");
        System.out.println("2. Lacag dhigasho");
        System.out.println("3. lacag qaadasho");
        System.out.println("4.Ka Wareeji EVCPlus");
        System.out.println("5.Ka Wareeji Account-kaga");
        System.out.println("6.Hubi Wareejin Account");
        System.out.println("7.Maareynta Baankiga");
        System.out.println("8.Kala Bax");

        System.out.println("dooro");
        Scanner scanner=new Scanner(System.in);

        int dooro = scanner.nextInt();
        int haraaga = 500;
        if (dooro == 1) {
            balance();
        } else if (dooro == 2) {
            System.out.println("*** Lacag dhigasho *** ");
            System.out.println("Soo gali lacagta");
            int lacagta = scanner.nextInt();
            haraaga += lacagta;
            System.out.println("Haraagaagu waa " + haraaga);
        } else if (dooro == 3) {
            System.out.println(" *** Lacag qaadasho ***");
            System.out.println("sogali lacagta aad qaadaneysid");
            int qadasho = scanner.nextInt();
            haraaga -= qadasho;
            if (haraaga >= qadasho) {
                System.out.println("haraagu ku haray waa $ " + haraaga);
            } else
                System.out.println("Haraaagau kuma filno $ " + haraaga);
        } else if (dooro == 4) {
            System.out.println(" *** Ka Wareeji EVCPlus ***");
            System.out.println("Gali Numbeka");
            int number = scanner.nextInt();
            System.out.println("Gali lacagta");
            int lacag = scanner.nextInt();
            if (lacag <= haraaga) {
                haraaga -= lacag;
                System.out.println("waxaad $" + lacag + " " + "u wareejisay" + "  " + number + " " + "haraagagu waa $" + " " + haraaga);
            }
        } else {
            System.out.println("Doorasho khaldan");
        }
    }

    //Badal numberk sit ah
    static void Maareyn() {
        System.out.println("Maareynta");
        System.out.println("1 Badel lamberka sirta ah");
        System.out.println("2. Badel Luqada");
        System.out.println("3. Wargalin Mobile Lumay");
        System.out.println("4. Lacag xirasho");
        System.out.println("5. U celi lacag qaldantay");

        System.out.println("dooro");
        Scanner scanner=new Scanner(System.in);

        int door = scanner.nextInt();
        switch (door) {
            case 1 -> {
                System.out.println("1 Badel lamberka sirta ah");
                System.out.println("Fadlan Galin Pinkaaga Cusub");
                int pin = scanner.nextInt();
                System.out.println("Waad badashay Pinkagi hore");
            }
            case 2 -> {
                System.out.println("2. **** Badel Luqada *****");
                System.out.println("Fadlan Dooro Luqada");
                System.out.println("1.English");
                System.out.println("2.Soomali");
                int som = scanner.nextInt();
                System.out.println("wad ku mahsantahay inaad badashay luuqada");
            }
            case 3 -> {
                System.out.println("3. *** Wargalin Mobile Lumay ****");
                System.out.println("Fadlan Gali mobile lumay");
                int mobile = scanner.nextInt();
                System.out.println("Fadlan gali Numberkisa Sirta ha");
                int sir = scanner.nextInt();
                System.out.println("Mahadsanid");
            }
            case 4 -> {
                System.out.println("4.**** Lacag xirasho ****");
                System.out.println("Fadlan Gali numberka Qaladka ah");
                int num = scanner.nextInt();
                System.out.println("Fadlan Gali Numberki lo Waday");
                int num2 = scanner.nextInt();
                System.out.println("Fadalan Gali Macluumaad");
                String maclumad = scanner.next();
                System.out.println("Ma Hubtaa inaa Xirto lacagtan");
                System.out.println("1. Haa");
                System.out.println("2. Maya");
                int haa = scanner.nextInt();
                System.out.println("mahadsanid");
            }
            case 5 -> {
                System.out.println("5.*** U celi lacag qaldantay***");
                System.out.println("fadlan gali aqoonsiga lacag dirida");
                int aqosi = scanner.nextInt();
                System.out.println("Ma hubta inad celineyso lacag");
                ;
                System.out.println("1. Haa");
                System.out.println("2. Maya");
                int haa = scanner.nextInt();
                System.out.println("invalid IMG card");
            }

        }
    }

//    PILL PAYMENT

    static void payment() {
        System.out.println("EVCPLUS");
        System.out.println("1. Itus Haraagaga Bilka");
        System.out.println("2. Wada bixi bilka");
        System.out.println("3. Qeyb ka bixi biilka");

        System.out.println("dooro");
        Scanner scanner=new Scanner(System.in);

        int dooro = scanner.nextInt();
        switch (dooro) {
            case 1 -> {
                System.out.println("1. **** Itus Haraagaga Bilka ***");
                System.out.println("Fadlan Gali Bill references number");
                int num = scanner.nextInt();
                System.out.println("some parameters are missing ");
            }
            case 2 -> {
                System.out.println("2. **** Wada bixi bilka ***");
                System.out.println("Fadlan Gali Bill references number");
                int num = scanner.nextInt();
                System.out.println("some parameters are missing ");
            }

            case 3 -> {
                System.out.println("3.**** Qeyb ka bixi biilka ****");
                System.out.println("Fadlan Gali Bill references number");
                int num = scanner.nextInt();
                System.out.println("some parameters are missing ");
            }
        }
    }
}
