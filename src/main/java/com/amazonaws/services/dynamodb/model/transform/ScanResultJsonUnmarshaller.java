/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodb.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Scan Result JSON Unmarshaller
 * @deprecated Use {@link com.amazonaws.services.dynamodbv2.model.transform.ScanResultJsonUnmarshaller} instead.
 */
@Deprecated
public class ScanResultJsonUnmarshaller implements Unmarshaller<ScanResult, JsonUnmarshallerContext> {

    

    public ScanResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScanResult scanResult = new ScanResult();

        
        
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Items", targetDepth)) {
                    scanResult.setItems(new ListUnmarshaller<java.util.Map<String,AttributeValue>>(new MapUnmarshaller<String,AttributeValue>(StringJsonUnmarshaller.getInstance(), AttributeValueJsonUnmarshaller.getInstance())).unmarshall(context));
                }
                if (context.testExpression("Count", targetDepth)) {
                    context.nextToken();
                    scanResult.setCount(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ScannedCount", targetDepth)) {
                    context.nextToken();
                    scanResult.setScannedCount(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastEvaluatedKey", targetDepth)) {
                    context.nextToken();
                    scanResult.setLastEvaluatedKey(KeyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ConsumedCapacityUnits", targetDepth)) {
                    context.nextToken();
                    scanResult.setConsumedCapacityUnits(DoubleJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) break;
            }
            

            token = context.nextToken();
        }
        
        return scanResult;
    }

    private static ScanResultJsonUnmarshaller instance;
    public static ScanResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ScanResultJsonUnmarshaller();
        return instance;
    }
}
    