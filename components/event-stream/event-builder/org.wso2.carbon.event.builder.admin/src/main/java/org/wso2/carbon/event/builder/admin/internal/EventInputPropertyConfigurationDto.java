package org.wso2.carbon.event.builder.admin.internal;
/**
 * Copyright (c) 2009, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * This class contains properties of inputs and outputs
 */
public class EventInputPropertyConfigurationDto {

    /**
     * Name of the property
     */
    private String name;
    /**
     * Value of the property
     */
    private String valueOf;
    /**
     * Type of the property
     */
    private String type;
    private String defaultValue;

    public EventInputPropertyConfigurationDto() {
    }

    public EventInputPropertyConfigurationDto(String name, String valueOf, String type, String defaultValue) {
        this.name = name;
        this.valueOf = valueOf;
        this.type = type;
        this.defaultValue = defaultValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValueOf() {
        return valueOf;
    }

    public void setValueOf(String valueOf) {
        this.valueOf = valueOf;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}