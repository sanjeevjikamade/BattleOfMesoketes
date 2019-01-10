package com.sanjeev.battleofmesoketes.Interface;

/**
 * author::Sanjeev Jikamade
 */

public interface BattleResultCallback {
    void onSuccess(int result);
    void onFailure(String error);
}
