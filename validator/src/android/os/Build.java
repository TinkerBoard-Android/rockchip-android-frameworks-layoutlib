/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.os;

public class Build {
    public static class VERSION {
        public static int SDK_INT = _Original_Build.VERSION.SDK_INT;
    }

    public static class VERSION_CODES {
        public final static int Q = _Original_Build.VERSION_CODES.Q;
        public final static int N = _Original_Build.VERSION_CODES.N;
        public final static int LOLLIPOP_MR1 = _Original_Build.VERSION_CODES.LOLLIPOP_MR1;
        public final static int LOLLIPOP = _Original_Build.VERSION_CODES.LOLLIPOP;

        public final static int JELLY_BEAN = _Original_Build.VERSION_CODES.JELLY_BEAN;
        public final static int HONEYCOMB = _Original_Build.VERSION_CODES.HONEYCOMB;
        public final static int JELLY_BEAN_MR2 = _Original_Build.VERSION_CODES.JELLY_BEAN_MR2;
        public final static int JELLY_BEAN_MR1 = _Original_Build.VERSION_CODES.JELLY_BEAN_MR1;
    }
}
