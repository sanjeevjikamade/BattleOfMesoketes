package com.sanjeev.battleofmesoketes.utils;
import java.util.Arrays;


/**
 * author::Sanjeev Jikamade
 */
public class BattleUtils {

    Integer[] battlePoinsInitial = {0, 0, 0, 0};
    int successCounter = 0;

    public int getBattleResult(Integer[][] battlePoints){
        try{
        successCounter = 0;
        Arrays.fill(battlePoinsInitial, 0);

        for (Integer[] currentPoints : battlePoints) {
            successCounter += numberOfBattleSucceed(battlePoinsInitial, currentPoints);
        }

        return successCounter;
        }catch (Exception ex){ex.printStackTrace();}
        return 0;
    }

    private int numberOfBattleSucceed(Integer[] previousStrengths, Integer[] currentStrengths) {
        try{
        int count = 0;
        for (int i = 0; i < currentStrengths.length; i++) {
            if (currentStrengths[i] == 0 || currentStrengths[i] < previousStrengths[i]) {
                if (currentStrengths[i] < previousStrengths[i])
                    currentStrengths[i] = previousStrengths[i];

            } else if (currentStrengths[i] > previousStrengths[i])
                count++;

        }
        battlePoinsInitial = currentStrengths;
        return count;
        }catch (Exception ex){ex.printStackTrace();}
        return 0;
    }

}
