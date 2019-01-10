package com.sanjeev.battleofmesoketes.Data;

/**
 * author::Sanjeev Jikamade
 */

public class InputData {

    private Integer[][] battlePoints1 = {{3, 4, 0, 2},
                                        {3, 2, 4, 0},
                                        {2, 0, 5, 3}};


    //Generalised data
    private Integer[][] battlePoints2 = {{2, 4, 0, 3},
                                        {3, 5, 0, 0},
                                        {3, 4, 0, 6}};


    public Integer[][] getBattlePoints1() {
        return battlePoints1;
    }

    public Integer[][] getBattlePoints2() {
        return battlePoints2;
    }

}
