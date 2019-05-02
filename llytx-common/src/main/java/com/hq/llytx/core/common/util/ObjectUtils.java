/*
 *  Copyright huangqun Holding Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.hq.llytx.core.common.util;

import java.util.Collection;

/**
 * @Author: huangqun
 * @Date: 2019-05-01 23:46
 * @Version 1.0.0
 */
public class ObjectUtils {

    public static boolean isEmpty(Collection<?> c) {
        return c == null || c.size()== 0;
    }

    public static boolean isEmpty(Object[] array) {
        return array == null || array.length == 0;
    }


}
