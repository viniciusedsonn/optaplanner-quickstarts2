/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
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

package org.acme.factoriolayout.domain;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

public class Requirement {

    @JsonIdentityReference(alwaysAsId = true)
    private Recipe recipe;
    private long amountMillis;

    // No-arg constructor required for Jackson
    public Requirement() {}

    public Requirement(Recipe recipe, long amountMillis) {
        this.recipe = recipe;
        this.amountMillis = amountMillis;
    }

    @Override
    public String toString() {
        return recipe.getName();
    }

    // ************************************************************************
    // Getters and setters
    // ************************************************************************

    public Recipe getRecipe() {
        return recipe;
    }

    public long getAmountMillis() {
        return amountMillis;
    }
}
