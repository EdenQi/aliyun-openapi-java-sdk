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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.ChangeResellerConsumeAmountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeResellerConsumeAmountResponseUnmarshaller {

	public static ChangeResellerConsumeAmountResponse unmarshall(ChangeResellerConsumeAmountResponse changeResellerConsumeAmountResponse, UnmarshallerContext _ctx) {
		
		changeResellerConsumeAmountResponse.setRequestId(_ctx.stringValue("ChangeResellerConsumeAmountResponse.RequestId"));
		changeResellerConsumeAmountResponse.setCode(_ctx.stringValue("ChangeResellerConsumeAmountResponse.Code"));
		changeResellerConsumeAmountResponse.setMessage(_ctx.stringValue("ChangeResellerConsumeAmountResponse.Message"));
		changeResellerConsumeAmountResponse.setSuccess(_ctx.booleanValue("ChangeResellerConsumeAmountResponse.Success"));
		changeResellerConsumeAmountResponse.setData(_ctx.stringValue("ChangeResellerConsumeAmountResponse.Data"));
	 
	 	return changeResellerConsumeAmountResponse;
	}
}