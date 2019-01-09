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

package com.aliyuncs.aegis.transform.v20161111;

import com.aliyuncs.aegis.model.v20161111.DescribeAttackAnalysisDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAttackAnalysisDataResponseUnmarshaller {

	public static DescribeAttackAnalysisDataResponse unmarshall(DescribeAttackAnalysisDataResponse describeAttackAnalysisDataResponse, UnmarshallerContext context) {
		
		describeAttackAnalysisDataResponse.setRequestId(context.stringValue("DescribeAttackAnalysisDataResponse.RequestId"));
		describeAttackAnalysisDataResponse.setData(context.stringValue("DescribeAttackAnalysisDataResponse.Data"));
		describeAttackAnalysisDataResponse.setTotal(context.integerValue("DescribeAttackAnalysisDataResponse.Total"));
		describeAttackAnalysisDataResponse.setPage(context.integerValue("DescribeAttackAnalysisDataResponse.Page"));
		describeAttackAnalysisDataResponse.setPageSize(context.integerValue("DescribeAttackAnalysisDataResponse.PageSize"));
	 
	 	return describeAttackAnalysisDataResponse;
	}
}