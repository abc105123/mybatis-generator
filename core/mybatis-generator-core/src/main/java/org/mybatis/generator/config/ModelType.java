/*
 *    Copyright 2006-2025 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.generator.config;

import static org.mybatis.generator.internal.util.messages.Messages.getString;

/**
 * Typesafe enum of different model types.
 *
 * @author Jeff Butler
 */
public enum ModelType {
    HIERARCHICAL("hierarchical"), //$NON-NLS-1$
    FLAT("flat"), //$NON-NLS-1$
    CONDITIONAL("conditional"); //$NON-NLS-1$

    private final String type;

    ModelType(String type) {
        this.type = type;
    }

    public static ModelType getModelType(String type) {
        if (HIERARCHICAL.type.equalsIgnoreCase(type)) {
            return HIERARCHICAL;
        } else if (FLAT.type.equalsIgnoreCase(type)) {
            return FLAT;
        } else if (CONDITIONAL.type.equalsIgnoreCase(type)) {
            return CONDITIONAL;
        } else {
            throw new RuntimeException(getString("RuntimeError.13", type)); //$NON-NLS-1$
        }
    }
}
