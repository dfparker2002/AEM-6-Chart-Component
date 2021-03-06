/*
 * Copyright (c) 2015 faizod GmbH & Co. KG
 * Großenhainer Straße 101, D-01127 Dresden, Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.faizod.aem.component.core.servlets.charts;

import org.apache.sling.api.resource.Resource;

import java.io.Writer;
import java.util.List;
import java.util.Map;

/**
 * Interface for DataProvider.
 */
public interface ChartDataProvider {

    /**
     * Takes the chart data and chart configuration, merges data and configuration in one object and writes
     * the final data as a json object into the provided writer.
     */
    void writeMultiColumnChartData(Map<Object, List<Object>> chartData, Resource resource, Writer writer);
}
