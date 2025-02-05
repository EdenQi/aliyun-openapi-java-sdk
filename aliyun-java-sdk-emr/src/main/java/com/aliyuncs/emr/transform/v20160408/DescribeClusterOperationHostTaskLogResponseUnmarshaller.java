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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.DescribeClusterOperationHostTaskLogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterOperationHostTaskLogResponseUnmarshaller {

	public static DescribeClusterOperationHostTaskLogResponse unmarshall(DescribeClusterOperationHostTaskLogResponse describeClusterOperationHostTaskLogResponse, UnmarshallerContext _ctx) {
		
		describeClusterOperationHostTaskLogResponse.setRequestId(_ctx.stringValue("DescribeClusterOperationHostTaskLogResponse.RequestId"));
		describeClusterOperationHostTaskLogResponse.setStdout(_ctx.stringValue("DescribeClusterOperationHostTaskLogResponse.Stdout"));
		describeClusterOperationHostTaskLogResponse.setStderr(_ctx.stringValue("DescribeClusterOperationHostTaskLogResponse.Stderr"));
	 
	 	return describeClusterOperationHostTaskLogResponse;
	}
}