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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.RestartClusterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestartClusterResponseUnmarshaller {

	public static RestartClusterResponse unmarshall(RestartClusterResponse restartClusterResponse, UnmarshallerContext _ctx) {
		
		restartClusterResponse.setRequestId(_ctx.stringValue("RestartClusterResponse.RequestId"));
		restartClusterResponse.setSuccess(_ctx.booleanValue("RestartClusterResponse.Success"));
		restartClusterResponse.setMessage(_ctx.stringValue("RestartClusterResponse.Message"));
		restartClusterResponse.setErrorCode(_ctx.stringValue("RestartClusterResponse.ErrorCode"));
	 
	 	return restartClusterResponse;
	}
}