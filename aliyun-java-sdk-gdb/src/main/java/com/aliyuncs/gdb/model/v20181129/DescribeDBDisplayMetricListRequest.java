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

package com.aliyuncs.gdb.model.v20181129;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBDisplayMetricListRequest extends RpcAcsRequest<DescribeDBDisplayMetricListResponse> {
	
	public DescribeDBDisplayMetricListRequest() {
		super("gdb", "2018-11-29", "DescribeDBDisplayMetricList", "gdb");
	}

	private String skipAuth;

	private String dimension;

	public String getSkipAuth() {
		return this.skipAuth;
	}

	public void setSkipAuth(String skipAuth) {
		this.skipAuth = skipAuth;
		if(skipAuth != null){
			putQueryParameter("skipAuth", skipAuth);
		}
	}

	public String getDimension() {
		return this.dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
		if(dimension != null){
			putQueryParameter("Dimension", dimension);
		}
	}

	@Override
	public Class<DescribeDBDisplayMetricListResponse> getResponseClass() {
		return DescribeDBDisplayMetricListResponse.class;
	}

}
