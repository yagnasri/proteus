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

package com.flipkart.android.proteus.manager;

import android.support.annotation.Nullable;
import android.view.View;

import com.flipkart.android.proteus.Layout;
import com.flipkart.android.proteus.ProteusLayoutInflater;
import com.flipkart.android.proteus.ViewTypeParser;
import com.flipkart.android.proteus.toolbox.Binding;
import com.flipkart.android.proteus.toolbox.Scope;
import com.flipkart.android.proteus.toolbox.Styles;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * ProteusViewManager
 *
 * @author aditya.sharat
 */
public interface ProteusViewManager {

    /**
     * Update the {@link android.view.View} with new data.
     *
     * @param data New data for the view
     */
    void update(@Nullable JsonObject data);

    /**
     * Set the {@link View} which will be managed.
     *
     * @param view The view to manage.
     */
    void setView(View view);

    ProteusLayoutInflater getProteusLayoutInflater();

    void setProteusLayoutInflater(ProteusLayoutInflater proteusLayoutInflater);

    ViewTypeParser getTypeParser();

    void setTypeParser(ViewTypeParser parser);

    Layout getLayout();

    void setLayout(Layout layout);

    /**
     * Returns the current {@link Styles} set in this {@link android.view.View}.
     *
     * @return Returns the {@link Styles}.
     */
    @Nullable
    Styles getStyles();

    /**
     * Sets the {@link Styles} to be applied to this {@link android.view.View}
     */
    void setStyles(@Nullable Styles styles);

    int getUniqueViewId(String id);

    JsonElement get(String dataPath, int index);

    void set(String dataPath, JsonElement newValue);

    void set(String dataPath, String newValue);

    void set(String dataPath, Number newValue);

    void set(String dataPath, boolean newValue);

    @Nullable
    Layout getChildLayout();

    void setChildLayout(@Nullable Layout layout);

    Scope getScope();

    void setScope(Scope scope);

    @Nullable
    String getDataPathForChildren();

    void setDataPathForChildren(@Nullable String dataPathForChildren);

    boolean isViewUpdating();

    void addBinding(Binding binding);

    /**
     * Free all resources held by the view manager
     */
    void destroy();

    void setOnUpdateDataListener(@Nullable OnUpdateDataListener listener);

    void removeOnUpdateDataListener();

    @Nullable
    OnUpdateDataListener getOnUpdateDataListeners();

    interface OnUpdateDataListener {

        JsonObject onBeforeUpdateData(@Nullable JsonObject data);

        JsonObject onAfterDataContext(@Nullable JsonObject data);

        void onUpdateDataComplete(@Nullable JsonObject data);
    }
}
