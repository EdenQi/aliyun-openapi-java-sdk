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

package com.aliyuncs.oos.transform.v20190601;

import com.aliyuncs.oos.model.v20190601.DeleteExecutionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteExecutionsResponseUnmarshaller {

	public static DeleteExecutionsResponse unmarshall(DeleteExecutionsResponse deleteExecutionsResponse, UnmarshallerContext _ctx) {
		
		deleteExecutionsResponse.setRequestId(_ctx.stringValue("DeleteExecutionsResponse.RequestId"));
	 
	 	return deleteExecutionsResponse;
	}
}