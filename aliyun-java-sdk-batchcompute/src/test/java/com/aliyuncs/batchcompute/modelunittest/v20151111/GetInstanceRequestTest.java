/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyuncs.batchcompute.modelunittest.v20151111;


import com.aliyuncs.batchcompute.model.v20151111.GetInstanceRequest;
import com.aliyuncs.batchcompute.model.v20151111.GetTaskRequest;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by guangchun.luo on 15/5/6.
 */
public class GetInstanceRequestTest extends TestCase {

    @Test
    public void testConstructor() {

        String jobId = "xx000111";
        GetInstanceRequest req = new GetInstanceRequest();
        req.setJobId(jobId);
        req.setTaskName("task_1");
        req.setInstanceId(0);

        assertEquals(req.getInstanceId(), 0);
        assertEquals(req.getJobId(), jobId);
        assertEquals(req.getTaskName(), "task_1");
    }
}
