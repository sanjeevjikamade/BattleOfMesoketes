package com.sanjeev.battleofmesoketes.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.sanjeev.battleofmesoketes.Interface.BattleResultCallback;

/**
 * author::Sanjeev Jikamade
 */

public class BattleVewModelFactory extends ViewModelProvider.NewInstanceFactory {

    BattleResultCallback battleResultCallback;

    public BattleVewModelFactory(BattleResultCallback battleResultCallback) {
        this.battleResultCallback = battleResultCallback;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new BattleViewModel(battleResultCallback);
    }
}
