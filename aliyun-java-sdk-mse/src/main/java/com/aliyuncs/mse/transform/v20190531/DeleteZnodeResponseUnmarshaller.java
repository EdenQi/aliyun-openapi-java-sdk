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

import com.aliyuncs.mse.model.v20190531.DeleteZnodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteZnodeResponseUnmarshaller {

	public static DeleteZnodeResponse unmarshall(DeleteZnodeResponse deleteZnodeResponse, UnmarshallerContext _ctx) {
		
		deleteZnodeResponse.setRequestId(_ctx.stringValue("DeleteZnodeResponse.RequestId"));
		deleteZnodeResponse.setSuccess(_ctx.booleanValue("DeleteZnodeResponse.Success"));
		deleteZnodeResponse.setMessage(_ctx.stringValue("DeleteZnodeResponse.Message"));
		deleteZnodeResponse.setErrorCode(_ctx.stringValue("DeleteZnodeResponse.ErrorCode"));
		deleteZnodeResponse.setData(_ctx.stringValue("DeleteZnodeResponse.Data"));
		deleteZnodeResponse.setHttpCode(_ctx.stringValue("DeleteZnodeResponse.HttpCode"));
	 
	 	return deleteZnodeResponse;
	}
}