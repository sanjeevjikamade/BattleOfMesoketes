package com.sanjeev.battleofmesoketes.utils;

import android.widget.Toast;

import java.util.Arrays;

public class BattleUtils {

    Integer[] battlePoinsInitial = {0, 0, 0, 0};
    int successCounter = 0;

    public int getBattleResult(Integer[][] battlePoints){
        successCounter = 0;
        Arrays.fill(battlePoinsInitial, 0);

        for (Integer[] currentPoints : battlePoints) {
            successCounter += numberOfBattleSucceed(battlePoinsInitial, currentPoints);
        }

        return successCounter;
    }

    private int numberOfBattleSucceed(Integer[] previousStrengths, Integer[] currentStrengths) {
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
    }

}
