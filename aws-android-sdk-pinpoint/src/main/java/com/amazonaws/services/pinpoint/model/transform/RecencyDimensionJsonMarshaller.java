/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RecencyDimension
 */
class RecencyDimensionJsonMarshaller {

    public void marshall(RecencyDimension recencyDimension, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (recencyDimension.getDuration() != null) {
            String duration = recencyDimension.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (recencyDimension.getRecencyType() != null) {
            String recencyType = recencyDimension.getRecencyType();
            jsonWriter.name("RecencyType");
            jsonWriter.value(recencyType);
        }
        jsonWriter.endObject();
    }

    private static RecencyDimensionJsonMarshaller instance;

    public static RecencyDimensionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecencyDimensionJsonMarshaller();
        return instance;
    }
}
