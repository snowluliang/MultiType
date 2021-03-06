/*
 * Copyright 2016 drakeet. https://github.com/drakeet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.drakeet.multitype.sample.one2many;

import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;

/**
 * @author drakeet
 */
public class Data {

    public static final int TYPE_1 = 1;
    public static final int TYPE_2 = 2;

    @SerializedName("title") public String title;
    @SerializedName("type") public int type;


    public Data(@NonNull String title, int type) {
        this.title = title;
        this.type = type;
    }
}
