/*
 * Artifactural
 * Copyright (c) 2018-2024.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.artifactural.api.artifact;

import java.util.Map.Entry;
import java.util.Set;

public interface ArtifactAttributeCollection extends Iterable<Entry<ArtifactAttribute<?>, Object>> {
    static ArtifactAttributeCollection empty() {
        return Internal.NO_ATTRIBUTES;
    }

    <T> T with(ArtifactAttribute<T> attribute, T value);

    <T> T get(ArtifactAttribute<T> key);

    Set<ArtifactAttribute<?>> keys();
}