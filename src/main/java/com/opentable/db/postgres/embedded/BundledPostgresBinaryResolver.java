/*
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

package com.opentable.db.postgres.embedded;

import static java.lang.String.format;

import java.io.InputStream;

/**
 * Resolves pre-bundled binaries from within the JAR file.
 */
final class BundledPostgresBinaryResolver implements PgBinaryResolver {

    @Override
    public InputStream getPgBinary(String system, String machineHardware) {
        return EmbeddedPostgres.class.getResourceAsStream("postgresql-Darwin-x86_64.txz");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        return o != null && getClass() == o.getClass();
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
