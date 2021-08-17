package enumtest;

import a.enumtest.USACoinVO;

public class CoinUse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int coin = 5;
        String coinStr = "";

        switch (coin) {
            case USACoinVO.PENNY:
                coinStr = "PENNY";
                break;
            case USACoinVO.NICKLE:
                coinStr = "NICKLE";
                break;
            case USACoinVO.DIME:
                coinStr = "DIME";
                break;
            case USACoinVO.QUARTER:
                coinStr = "QUARTER";
                break;
        }
        System.out.printf("USACoinVO 클래스 사용 : %d , %s \n", coin, coinStr);

        switch (coin) {
            case USACoinService.PENNY:
                coinStr = "PENNY";
                break;
            case USACoinService.NICKLE:
                coinStr = "NICKLE";
                break;
            case USACoinService.DIME:
                coinStr = "DIME";
                break;
            case USACoinService.QUARTER:
                coinStr = "QUARTER";
                break;
        }
        System.out.printf("USACoinService 인터페이스 사용 : %d , %s \n", coin, coinStr);

        USACoin usaCoin = USACoin.NICKLE;
        System.out.println(usaCoin.PENNY.ordinal()+ " " + usaCoin);

    }//main() end
}