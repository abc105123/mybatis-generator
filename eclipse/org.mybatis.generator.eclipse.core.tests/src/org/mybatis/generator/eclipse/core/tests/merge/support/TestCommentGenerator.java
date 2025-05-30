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
 *
 */
package org.mybatis.generator.eclipse.core.tests.merge.support;

import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.internal.DefaultCommentGenerator;

/**
 * This class adds simple comments without needing to know the generated table name.
 * This is appropriate for test code as all we really need is the Javadoc tag.
 * 
 * @author Jeff Butler
 *
 */
public class TestCommentGenerator extends DefaultCommentGenerator {

    public void addFieldComment(Field field) {
        field.addJavaDocLine("/**"); //$NON-NLS-1$
        field.addJavaDocLine(" * This field was generated by MyBatis Generator."); //$NON-NLS-1$
        addJavadocTag(field, false);
        field.addJavaDocLine(" */"); //$NON-NLS-1$
    }

    public void addMethodComment(Method method) {
        method.addJavaDocLine("/**"); //$NON-NLS-1$
        method.addJavaDocLine(" * This method was generated by MyBatis Generator."); //$NON-NLS-1$
        addJavadocTag(method, false);
        method.addJavaDocLine(" */"); //$NON-NLS-1$
    }
}
