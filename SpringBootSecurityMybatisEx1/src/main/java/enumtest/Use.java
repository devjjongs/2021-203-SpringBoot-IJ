package enumtest;

import a.enumtest.USACoinVO;

import static a.enumtest.USACoinVO.DIME;

public class Use {
    public static void main(String[] args) {
//    new NoInstanceNoExtends();
        System.out.println(USACoinVO.DIME);
        System.out.println(DIME);
        System.out.println(USACoinService.DIME);
    }
}
