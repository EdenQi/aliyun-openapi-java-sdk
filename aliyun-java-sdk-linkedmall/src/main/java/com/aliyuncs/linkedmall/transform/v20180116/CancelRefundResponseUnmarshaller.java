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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.CancelRefundResponse;
import com.aliyuncs.linkedmall.model.v20180116.CancelRefundResponse.RefundApplicationData;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelRefundResponseUnmarshaller {

	public static CancelRefundResponse unmarshall(CancelRefundResponse cancelRefundResponse, UnmarshallerContext _ctx) {
		
		cancelRefundResponse.setRequestId(_ctx.stringValue("CancelRefundResponse.RequestId"));
		cancelRefundResponse.setCode(_ctx.stringValue("CancelRefundResponse.Code"));
		cancelRefundResponse.setMessage(_ctx.stringValue("CancelRefundResponse.Message"));

		RefundApplicationData refundApplicationData = new RefundApplicationData();
		refundApplicationData.setSubLmOrderId(_ctx.stringValue("CancelRefundResponse.RefundApplicationData.SubLmOrderId"));
		refundApplicationData.setDisputeStatus(_ctx.integerValue("CancelRefundResponse.RefundApplicationData.DisputeStatus"));
		refundApplicationData.setDisputeType(_ctx.integerValue("CancelRefundResponse.RefundApplicationData.DisputeType"));
		cancelRefundResponse.setRefundApplicationData(refundApplicationData);
	 
	 	return cancelRefundResponse;
	}
}