/*
 * Apache License
 * Version 2.0, January 2004
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * TERMS AND CONDITIONS FOR USE, REPRODUCTION, AND DISTRIBUTION
 *
 * Copyright (c) 2017 Flipkart Internet Pvt. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.flipkart.android.proteus.support.design.widget;

import android.support.design.widget.FloatingActionButton;
import android.view.View;

import com.flipkart.android.proteus.ProteusContext;
import com.flipkart.android.proteus.ProteusView;

/**
 * ProteusFloatingActionButton
 *
 * @author adityasharat
 */

public class ProteusFloatingActionButton extends FloatingActionButton implements ProteusView {

    private Manager manager;

    public ProteusFloatingActionButton(ProteusContext context) {
        super(context);
    }

    @Override
    public Manager getViewManager() {
        return manager;
    }

    @Override
    public void setViewManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public View getAsView() {
        return this;
    }
}
