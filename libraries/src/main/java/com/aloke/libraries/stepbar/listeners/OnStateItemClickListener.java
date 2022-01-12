package com.aloke.libraries.stepbar.listeners;

import com.aloke.libraries.stepbar.StateBar;
import com.aloke.libraries.stepbar.components.StateItem;


public interface OnStateItemClickListener {

    void onStateItemClick(StateBar stateProgressBar, StateItem stateItem, int stateNumber, boolean isCurrentState);

}
