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
package org.mybatis.generator.api.dom.java;

import java.util.Objects;

public class PrimitiveTypeWrapper extends FullyQualifiedJavaType {
    private static PrimitiveTypeWrapper booleanInstance;
    private static PrimitiveTypeWrapper byteInstance;
    private static PrimitiveTypeWrapper characterInstance;
    private static PrimitiveTypeWrapper doubleInstance;
    private static PrimitiveTypeWrapper floatInstance;
    private static PrimitiveTypeWrapper integerInstance;
    private static PrimitiveTypeWrapper longInstance;
    private static PrimitiveTypeWrapper shortInstance;

    private final String toPrimitiveMethod;

    /**
     * Use the static getXXXInstance methods to gain access to one of the type
     * wrappers.
     *
     * @param fullyQualifiedName
     *            fully qualified name of the wrapper type
     * @param toPrimitiveMethod
     *            the method that returns the wrapped primitive
     */
    private PrimitiveTypeWrapper(String fullyQualifiedName,
            String toPrimitiveMethod) {
        super(fullyQualifiedName);
        this.toPrimitiveMethod = toPrimitiveMethod;
    }

    public String getToPrimitiveMethod() {
        return toPrimitiveMethod;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PrimitiveTypeWrapper other)) {
            return false;
        }

        return getFullyQualifiedName().equals(other.getFullyQualifiedName());
    }

    public static PrimitiveTypeWrapper getBooleanInstance() {
        booleanInstance = Objects.requireNonNullElseGet(booleanInstance,
                () -> new PrimitiveTypeWrapper("java.lang.Boolean", //$NON-NLS-1$
                    "booleanValue()")); //$NON-NLS-1$
        return booleanInstance;
    }

    public static PrimitiveTypeWrapper getByteInstance() {
        byteInstance = Objects.requireNonNullElseGet(byteInstance,
                () -> new PrimitiveTypeWrapper("java.lang.Byte", //$NON-NLS-1$
                    "byteValue()")); //$NON-NLS-1$
        return byteInstance;
    }

    public static PrimitiveTypeWrapper getCharacterInstance() {
        characterInstance = Objects.requireNonNullElseGet(characterInstance,
                () -> new PrimitiveTypeWrapper("java.lang.Character", //$NON-NLS-1$
                    "charValue()")); //$NON-NLS-1$
        return characterInstance;
    }

    public static PrimitiveTypeWrapper getDoubleInstance() {
        doubleInstance = Objects.requireNonNullElseGet(doubleInstance,
                () -> new PrimitiveTypeWrapper("java.lang.Double", //$NON-NLS-1$
                    "doubleValue()")); //$NON-NLS-1$
        return doubleInstance;
    }

    public static PrimitiveTypeWrapper getFloatInstance() {
        floatInstance = Objects.requireNonNullElseGet(floatInstance,
                () -> new PrimitiveTypeWrapper("java.lang.Float", //$NON-NLS-1$
                    "floatValue()")); //$NON-NLS-1$
        return floatInstance;
    }

    public static PrimitiveTypeWrapper getIntegerInstance() {
        integerInstance = Objects.requireNonNullElseGet(integerInstance,
                () -> new PrimitiveTypeWrapper("java.lang.Integer", //$NON-NLS-1$
                    "intValue()")); //$NON-NLS-1$
        return integerInstance;
    }

    public static PrimitiveTypeWrapper getLongInstance() {
        longInstance = Objects.requireNonNullElseGet(longInstance,
                () -> new PrimitiveTypeWrapper("java.lang.Long", //$NON-NLS-1$
                    "longValue()")); //$NON-NLS-1$
        return longInstance;
    }

    public static PrimitiveTypeWrapper getShortInstance() {
        shortInstance = Objects.requireNonNullElseGet(shortInstance,
                () -> new PrimitiveTypeWrapper("java.lang.Short", //$NON-NLS-1$
                    "shortValue()")); //$NON-NLS-1$
        return shortInstance;
    }
}
