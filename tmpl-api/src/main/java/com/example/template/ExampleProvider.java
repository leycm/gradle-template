/*
 * This file is part of the linguae Library.
 *
 * Licensed under the GNU Lesser General Public License v3.0 (LGPL-3.0)
 * You should have received a copy of the license in LICENSE.LGPL
 * If not, see https://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Copyright (c) leycm <leycm@proton.me>
 * Copyright (c) maintainers
 */
package com.example.template;

import de.leycm.init4j.instance.Instanceable;

import lombok.NonNull;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public interface ExampleProvider extends Instanceable {

    @Contract(pure = true)
    static @NonNull ExampleProvider getInstance() {
        return Instanceable.getInstance("com.example.template", ExampleProvider.class);
    }

    @NonNull String getExampleValue();

    @NonNull String getNoDefaultValue();

    @Nullable String getExampleValue(@NonNull String key);

}