/*
 * Copyright (c) 2015 Christian Chevalley
 * This file is part of Project Ethercis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ethercis.ehr.encode.wrappers.json.writer.translator_db2raw;

/**
 * Created by christian on 6/22/2017.
 */
public class RawJsonKey {

    String originalKey;

    public RawJsonKey(String originalKey) {
        this.originalKey = originalKey;
    }

    String toRawJson() {
        String key = originalKey;
        if (key.startsWith("/"))
            key = originalKey.substring(1);
        //strip the [...] node predicate
        if (key.contains("[")) {
            key = key.substring(0, key.indexOf("["));
        }
        return key;
    }
}
